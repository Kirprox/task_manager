package sorokin.dev.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("sorokin.dev");
        Task task = context.getBean(Task.class);
        Task task1 = (Task) context.getBean("main-task");
        System.out.println(task1);
        System.out.println(task);
        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();
    }
}

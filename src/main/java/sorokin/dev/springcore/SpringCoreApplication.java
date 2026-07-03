package sorokin.dev.springcore;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("sorokin.dev");
        Task mainTask = (Task) context.getBean("main-task");
//        Task notMainTask = (Task) context.getBean("not-main-task");
//        System.out.println(task1);
//        System.out.println(task);
        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();
    }
}

package sorokin.dev.springcore;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("sorokin.dev");
        Task task1 = context.getBean(Task.class);
        Task task2 = context.getBean(Task.class);
        System.out.println(task1 == task2);

        TaskManager taskManager = (TaskManager) context.getBean(TaskManager.class);
        taskManager.printTask();
        TaskManager taskManager2 = (TaskManager) context.getBean(TaskManager.class);
        taskManager2.printTask();


        TaskExecutor executor = (TaskExecutor) context.getBean(TaskExecutor.class);
        executor.printTask();

        context.close();
    }
}

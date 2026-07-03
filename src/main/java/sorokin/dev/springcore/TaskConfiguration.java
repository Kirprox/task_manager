//package sorokin.dev.springcore;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Lazy;
//
//@Configuration
//public class TaskConfiguration {
//    @Bean("main-task")
//    public Task task(@Lazy TaskManager taskManager) {
//        return new Task(taskManager);
//    }
//
//    @Bean
//    public TaskManager taskManager(Task task) {
//        return new TaskManager(task);
//    }
////    @Bean("not-main-task")
////    public Task task2() {
////        return new Task();
////    }
//}

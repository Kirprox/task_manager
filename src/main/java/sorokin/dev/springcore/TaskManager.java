package sorokin.dev.springcore;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sorokin.dev.aop.Loggable;

@Component
//@Scope("prototype")
public class TaskManager {
    //    @Autowired
    private final Task task;

    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }

    @PostConstruct
    public void postConstructTaskManager() {
//        System.out.println("this is post construct task manager");
    }

    @PreDestroy
    public void preDestroyTaskManager() {
//        System.out.println("this is pre destroy task manager");
    }

    @Loggable
    public Long printTask() {
        System.out.println("Current task: " + task.toString());
//            throw new RuntimeException("Exception in task manager");
        return task.getDuration();
    }

//    @Autowired
//    public void setTask(Task task) {
//        this.task = task;
//    }
}

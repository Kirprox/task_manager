package sorokin.dev.springcore;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("main-task")
//@Scope("prototype")
public class Task {
    private final String name;
    private final Long duration;


    public Task(
            @Value("${task.name}") String name,
            @Value("${task.duration}") Long duration
    ) {
        this.name = name;
        this.duration = duration;
        System.out.println("call task constuctor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("task postconstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("task pre destroy");
    }


//    @Autowired
//    public void setTaskManager(TaskManager taskManager) {
//        this.taskManager = taskManager;
//    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }

    public String getName() {
        return name;
    }

    public Long getDuration() {
        return duration;
    }
}

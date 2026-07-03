package sorokin.dev.springcore;


//@Component("main-task")
public class Task {
    private final String name;
    private final Long duration;
    private TaskManager taskManager;

    public Task(TaskManager taskManager) {
        this.name = "main-task";
        this.duration = 60L;
        this.taskManager = taskManager;
    }

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

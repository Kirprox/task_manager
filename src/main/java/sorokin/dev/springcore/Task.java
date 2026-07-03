package sorokin.dev.springcore;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("main-task")
@Scope("prototype")
public class Task {
    private final String name;
    private final Long duration;

    public Task() {
        this.name = "main-task";
        this.duration = 60L;
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

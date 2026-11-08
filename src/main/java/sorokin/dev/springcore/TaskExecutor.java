package sorokin.dev.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskExecutor {

    private final Task task;

    @Autowired
    public TaskExecutor(Task task) {
        this.task = task;
    }

    public void printTask() {
        System.out.println("hw "+task.getDuration());
    }
}

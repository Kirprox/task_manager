package sorokin.dev.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sorokin.dev.aop.Loggable;

@Component
public class TaskExecutor {

    private final Task task;

    @Autowired
    public TaskExecutor(Task task) {
        this.task = task;
    }

    @Loggable(value = "ERROR", countPrintLog = 10)
    public void printTaskExecutor() {
        System.out.println("hw " + task.getDuration());
    }
}

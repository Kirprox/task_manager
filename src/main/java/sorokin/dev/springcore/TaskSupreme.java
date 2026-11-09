package sorokin.dev.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskSupreme {
    private final Task task;

    @Autowired
    public TaskSupreme(Task task) {
        this.task = task;
    }

    public String returnSupreme(){
        System.out.println(task);
        return "supremeCommander";
    }
}

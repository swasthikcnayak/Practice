package Practice.lld.questions.taskManagementSystem;

import java.util.List;

public class Task {
    int id;
    User user;
    String created_at;
    String due_at;
    Priority priority;
    Status status;
    List<WorkLogs> logs;


    public void logWork(WorkLogs logg) {    
        this.logs.add(logg);
    }
}

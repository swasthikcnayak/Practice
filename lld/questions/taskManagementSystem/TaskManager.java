package Practice.lld.questions.taskManagementSystem;

import java.util.List;

public class TaskManager {
    
    private TaskRepository repository;
    private SearchManager searchManager;


    TaskManager(TaskRepository repository) {   
        this.repository = repository;
    }

    public void addTask(Task task) {
        repository.addTask(task);
    }   

    public void updateTask(int taskId, Task task) {
        repository.updateTask(taskId, task);
    }

    public void deleteTasK(int taskId) {    
        repository.delete(taskId);
    }

    public void addLogs(int taskId, WorkLogs logs) {
        repository.addLogs(taskId, logs);
    }

    public List<Task> searchTask(SearchParams searchParams) {
        return this.searchManager.search(repository, searchParams );
    }

}

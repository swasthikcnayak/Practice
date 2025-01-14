package Practice.lld.questions.taskManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    List<Task> tasks = new ArrayList<>();

    
}



class SearchParams {

}

class SearchManager {

    List<Task> search(TaskRepository repository, SearchParams searchParams) { 
       repository.getAll().filter( ... );
    }
}
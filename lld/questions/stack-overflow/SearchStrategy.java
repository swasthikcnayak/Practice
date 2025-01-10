package Practice.lld.questions.stack

import java.util.List;

-overflow;

public interface SearchStrategy {   
    public List<Post> search(List<Post> posts, String query);
}

class TagSearchStrategy implements SearchStrategy {

    public List<Post> search(List<Post> posts, String query) {  
        return posts.stream().filter(post -> post.tags.contains(query)).toList();
    }
}

class TitleSearchStrategy implements SearchStrategy {

    public List<Post> search(List<Post> posts, String query) {  
        return posts.stream().filter(post -> post.title.contains(query)).toList();
    }
}
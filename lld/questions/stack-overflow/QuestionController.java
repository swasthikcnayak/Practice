package Practice.lld.questions.stack-overflow;

public class QuestionController {
    List<Post> questions;
    SearchStrategy searchStrategy;


    void setStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    List<Post> search(String query) {
        questions = searchStrategy.search(questions, query);
    }

    void addQuestion(User user, Question question){
        user.addQuestion(question);
        question.add(questions);
    }
}

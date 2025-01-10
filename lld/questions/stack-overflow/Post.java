package Practice.lld.questions.stack-overflow;

interface Commentable{
    void addComment(Comment comment);
}
interface Votable{
    void addVote(Vote vote);
}
public abstract class Post implements Commentable, Votable {
    List<Vote> votes;
    List<Comments> comments;
}

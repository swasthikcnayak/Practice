package Practice.lld.questions.ticTakToe;

public class Player {
    String username;
    Piece piece;

    Player(String a,Piece b){this.username = a; this.piece = b;}

    Move getMove(){
        return new Move(1, 5);
    }
}


class Move{
    int x;
    int y;

    Move(int i,int j){
        this.x = i;
        this.y = j;
    }
}
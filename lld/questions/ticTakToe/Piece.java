package Practice.lld.questions.ticTakToe;

public class Piece {
    
    String pieceString;

    Piece(String p){
        this.pieceString = p;
    }
}


class PieceBuilder{

    public Piece getPiece(String s){
        return new Piece(s);
    }
}
package Practice.lld.questions.ticTakToe;

public interface ValidStateStrategy {
    public boolean isValid(Move move,  Cell[][] board);
}

class DefaultValidStrategy implements ValidStateStrategy {

    @Override
    public boolean isValid(Move move, Cell[][] board) {
        int x=move.x;
        int y = move.y;
       return x<board.length && x>=0 && y<board[0].length && y>=0 && board[x][y].p == null;
    }
    
}
package Practice.lld.questions.ticTakToe;

public class Board {
    Cell[][] board;
    GameWinStrategy gameWinStrategy;
    ValidStateStrategy ValidStateStrategy;
    int piecesPlaced = 0;

    Board(int n, GameWinStrategy winStrategy, ValidStateStrategy validStateStrategy){
        board = new Cell[n][n];
        this.gameWinStrategy = winStrategy;
        this.ValidStateStrategy = validStateStrategy;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                board[i][j] = new Cell(null, i, j); // cann use null object pattern by defining null piece
        }
    }

    public boolean placePiece(Piece piece, Move move){
        if(this.ValidStateStrategy.isValid(move,board)){
            board[move.x][move.y].p = piece;
            piecesPlaced++;
            return true;
        }
        return false;
    }

    public boolean hasWon(Move move){
        return this.gameWinStrategy.isWin(board[move.x][move.y], board);
    }

    public boolean isDraw(){
        return piecesPlaced == board.length*board.length;
    }
    
}

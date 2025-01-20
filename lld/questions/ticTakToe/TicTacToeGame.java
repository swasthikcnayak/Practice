package Practice.lld.questions.ticTakToe;


public class TicTacToeGame{
    Board board;
    PlayerManager playerManager;

    TicTacToeGame(int n,int m) throws Exception{
        board = new Board(n, new DefaultWinStrategy(), new DefaultValidStrategy());
        playerManager = new PlayerManager(m);
    }

    public void play(){
        while(true){
            Player currentPlayer = playerManager.getPlayer();
            Move move = currentPlayer.getMove();
            if(board.placePiece(currentPlayer.piece, move)){
                if(board.hasWon(move)){
                    System.out.println("Won "+currentPlayer);
                    break;
                }
            }
            if(board.isDraw()){
                System.out.println("Draw");
                break;
            }
        }
    }
}
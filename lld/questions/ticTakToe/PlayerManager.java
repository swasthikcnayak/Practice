package Practice.lld.questions.ticTakToe;

import java.util.Queue;

public class PlayerManager {
    Queue<Player> players;
    PieceBuilder pieceBuilder;

    PlayerManager(int m) throws Exception{
        if(m<=1){
            throw new Exception("Atleast 2 players needed");
        }
        pieceBuilder = new PieceBuilder();
        for(int i=0;i<m;i++){
            players.add(new Player("Player 1", pieceBuilder.getPiece("X")));
        }
    }

    Player getPlayer(){
        Player p = players.poll();
        players.add(p);
        return p;
    }
}

package Connect4;

import java.util.ArrayList;
import java.util.List;

public class Turn {
    private final int numPlayers = 2;

    private Player[] players;
    private int activePlayer;


    public Turn (){
        players = new Player[numPlayers];
        for(int i = 0; i<numPlayers; i++){
            players[i] = new Player(Color.get(i));
        }
        activePlayer = 0;
    }

    public void nextTurn(){
        this.activePlayer = (activePlayer + 1) % numPlayers;
    }

    public Player getActivePlayer(){
        return players[activePlayer];
    }
}

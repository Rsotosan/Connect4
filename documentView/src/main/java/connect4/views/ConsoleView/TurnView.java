package connect4.views.ConsoleView;

import connect4.models.Game;
import connect4.types.Color;
import connect4.views.Message;

public class TurnView {

    public void print(Game game){
        Color activePlayer = game.getActivePlayer();
        System.out.println(Message.TURN + "" + activePlayer);
    }

    public void nextTurn(Game game){
        game.nextTurn();
    }
}

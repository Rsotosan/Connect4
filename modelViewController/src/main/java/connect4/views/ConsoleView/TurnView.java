package connect4.views.ConsoleView;

import connect4.controllers.PlayController;
import connect4.models.Game;
import connect4.types.Color;
import connect4.views.Message;

public class TurnView {

    public void print(PlayController playController){
        Color activePlayer = playController.getActivePlayer();
        System.out.println(Message.TURN + "" + activePlayer);
    }

    public void nextTurn(PlayController playController){
        playController.nextTurn();
    }
}

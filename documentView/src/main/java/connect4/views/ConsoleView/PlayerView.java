package connect4.views.ConsoleView;

import connect4.ConsoleReader;
import connect4.models.Game;
import connect4.views.Message;
import connect4.views.ViewWithGame;

public class PlayerView extends ViewWithGame {

    public PlayerView(Game game) {
        super(game);
    }

    public void interact(){
        new TurnView().print(this.game);
        int column = this.getColumn();
        this.game.put(column);
    }

    public int getColumn() {
        System.out.println(Message.COLUMN);
        int column = ConsoleReader.getInstance().getInteger() - 1;
        while (!this.game.checkColumnFree(column)) {
            System.out.println(Message.ERRORINPUT);
            column = ConsoleReader.getInstance().getInteger() - 1;
        }
        return column;
    }
}

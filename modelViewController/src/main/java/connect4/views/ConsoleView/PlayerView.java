package connect4.views.ConsoleView;

import connect4.controllers.PlayController;
import connect4.utils.ConsoleReader;
import connect4.views.Message;

public class PlayerView {

    PlayController playController;

    public PlayerView(PlayController playController) {
        this.playController = playController;
    }

    public void interact(){
        new TurnView().print(this.playController);
        int column = this.getColumn();
        this.playController.put(column);
    }

    public int getColumn() {
        System.out.println(Message.COLUMN);
        int column = ConsoleReader.getInstance().getInteger() - 1;
        while (!this.playController.checkColumnFree(column)) {
            System.out.println(Message.ERRORINPUT);
            column = ConsoleReader.getInstance().getInteger() - 1;
        }
        return column;
    }
}

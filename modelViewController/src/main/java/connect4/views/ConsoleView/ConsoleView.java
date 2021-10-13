package connect4.views.ConsoleView;

import connect4.controllers.PlayController;
import connect4.models.Game;
import connect4.views.Message;
import connect4.views.View;

public class ConsoleView extends View {
    public PlayView playView;

    public ConsoleView(PlayController playController) {
        super(playController);
        this.playView = new PlayView(playController);
    }

    public void init() {
        System.out.println(Message.WELCOME);
    }

    public void play() {
        this.playView.interact();
    }
}

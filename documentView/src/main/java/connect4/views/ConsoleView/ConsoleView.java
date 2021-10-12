package connect4.views.ConsoleView;

import connect4.models.Game;
import connect4.views.Message;
import connect4.views.View;

public class ConsoleView extends View {
    public PlayView playView;

    public ConsoleView(Game game) {
        super(game);
        this.playView = new PlayView(game);
    }

    public void init() {
        System.out.println(Message.WELCOME);
    }

    public void play() {
        this.playView.interact();
    }
}

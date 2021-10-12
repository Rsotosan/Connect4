package connect4;

import connect4.models.Game;
import connect4.views.ConsoleView.ConsoleView;
import connect4.views.View;

public class Connect4Console extends Connect4{
    protected View createView(Game game) {
        return new ConsoleView(game);
    }

    public static void main(String[] args) {
        new Connect4Console().play();
    }
}

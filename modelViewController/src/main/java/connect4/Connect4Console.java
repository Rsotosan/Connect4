package connect4;

import connect4.views.ConsoleView.ConsoleView;
import connect4.views.View;

public class Connect4Console extends Connect4{
    protected View createView() {
        return new ConsoleView(this.playController);
    }

    public static void main(String[] args) {
        new Connect4Console().play();
    }
}

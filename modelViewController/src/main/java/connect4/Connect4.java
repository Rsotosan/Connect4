package connect4;

import connect4.controllers.PlayController;
import connect4.models.Board;
import connect4.models.Game;
import connect4.models.Player;
import connect4.models.Turn;
import connect4.types.GameStatus;
import connect4.views.View;

public abstract class Connect4 {
    private Game game;
    private View view;
    protected PlayController playController;

    public Connect4(){
        this.game = new Game();
        this.playController = new PlayController(this.game);
        this.view = createView();
    }

    protected abstract View createView();

    protected void play(){
        this.view.init();
        this.view.play();
    }
}

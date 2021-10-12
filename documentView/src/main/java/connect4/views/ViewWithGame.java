package connect4.views;

import connect4.models.Game;

public abstract class ViewWithGame {
    protected Game game;

    public ViewWithGame(Game game){
        this.game = game;
    }
}

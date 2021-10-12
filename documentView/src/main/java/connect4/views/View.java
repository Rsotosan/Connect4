package connect4.views;

import connect4.models.Game;

public abstract class View extends ViewWithGame {

    public View(Game game) {
        super(game);
    }

    public abstract void init();
    public abstract void play();
}


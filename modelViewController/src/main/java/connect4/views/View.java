package connect4.views;

import connect4.controllers.PlayController;
import connect4.models.Game;

public abstract class View{

    protected PlayController playController;

    public View(PlayController playController) {
        this.playController = playController;
    }

    public abstract void init();
    public abstract void play();
}


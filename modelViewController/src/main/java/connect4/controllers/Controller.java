package connect4.controllers;

import connect4.models.Game;

public abstract class Controller {
    protected Game game;

    protected Controller(Game game){
        this.game = game;
    }

}

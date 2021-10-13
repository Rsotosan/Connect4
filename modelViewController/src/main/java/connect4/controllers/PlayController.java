package connect4.controllers;

import connect4.models.Game;
import connect4.types.Color;
import connect4.types.GameStatus;

public class PlayController extends Controller{
    public PlayController(Game game) {
        super(game);
    }

    public GameStatus getGameStatus(){
        return this.game.getGameStatus();
    }

    public Color getActivePlayer() {
        return this.game.getActivePlayer();
    }

    public int getNumRows() {
        return this.game.getNumRows();
    }

    public int getNumColumns() {
        return this.game.getNumColumns();
    }

    public Color getCoordinate(int i, int j){
        return this.game.getCoordinate(i,j);
    }

    public void put(int column) {
        this.game.put(column);
    }

    public boolean checkColumnFree(int column) {
        return this.game.checkColumnFree(column);
    }

    public void nextTurn() {
        this.game.nextTurn();
    }
}

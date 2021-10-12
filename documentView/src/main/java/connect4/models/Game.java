package connect4.models;

import connect4.types.Color;
import connect4.types.GameStatus;

public class Game {
    private Turn turn;
    private Board board;

    private boolean gameOver = false;

    public Game(){
        turn = new Turn();
        board = new Board();
    }
    public void play(){
        Player activePlayer;
        GameStatus gameStatus;
        do{
            activePlayer = turn.getActivePlayer();
            //board.print();
            int column = activePlayer.getPut(board);
            while(!board.checkColumnFree(column)){
                //this.printColumnError();
                column = activePlayer.getPut(board);
            }
            board.put(column, activePlayer.getColor());
            gameStatus = board.checkGameStatus();
            if(gameStatus == GameStatus.PLAYING) turn.nextTurn();
        } while(gameStatus == GameStatus.PLAYING);

        if(gameStatus == GameStatus.WIN){
            //printWinner(activePlayer);
        } else if (gameStatus == GameStatus.DRAW){
            //printDraw();
        }
    }

    public int getNumRows(){
        return board.getRows();
    }

    public int getNumColumns(){
        return board.getColumns();
    }

    public Color getCoordinate(int i, int j){
        return board.getCoordinate(i,j);
    }

    public GameStatus getGameStatus(){
        return board.checkGameStatus();
    }

    public boolean checkColumnFree(int column){ return board.checkColumnFree(column); }

    public Color getActivePlayer() {
        return turn.getActivePlayer().getColor();
    }

    public void nextTurn(){
        turn.nextTurn();
    }

    public void put(int column) {
        this.board.put(column, this.turn.getActivePlayer().getColor());
    }
}

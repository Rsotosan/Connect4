package connect4.models;

import connect4.types.Color;
import connect4.types.GameStatus;

public class Board {
    private final int rows = 6;
    private final int columns = 8;
    private Color[][] board;

    public Board(){
        board = new Color[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                board[i][j] = Color.NULL;
            }
        }
    }

    public void put(int column, Color color){
        boolean isPut = false;
        int i = 0;
        do{
            if(board[i][column].isNull()){
                board[i][column] = color;
                isPut = true;
            }
            i++;
        }while(!isPut && i < rows);
    }

    public GameStatus checkGameStatus(){
        boolean fullBoard = true;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++) {
                if(!board[i][j].isNull()){
                    if (!checkCell(i, j).isNull()) return GameStatus.WIN;
                } else if(fullBoard){
                    fullBoard = false;
                }
            }
        }
        if(fullBoard){
            return GameStatus.DRAW;
        }
        return GameStatus.PLAYING;
    }

    public Color checkCell(int row, int column){
        int horizontal = 0;
        int vertical = 0;
        int diagonalRight = 0;
        int diagonalLeft = 0;
        for(int i=1; i<4; i++){
            if((column+i) < columns && board[row][column+i] == board[row][column]) horizontal++;
            if((row+i) < rows && board[row+i][column] == board[row][column]) vertical++;
            if((row+i) < rows && (column+i) < columns && board[row+i][column+i] == board[row][column]) diagonalRight++;
            if((row+i) < rows && (column-i) >= 0 && board[row+i][column-i] == board[row][column]) diagonalLeft++;
        }
        if(horizontal == 3 || vertical == 3 || diagonalLeft == 3 || diagonalRight == 3){
            return board[row][column];
        }
        return Color.NULL;
    }

    public boolean checkColumnFree(int column) {
        for(int i = 0; i<rows; i++){
            if(board[i][column].isNull()){
                return true;
            }
        }
        return false;
    }

    public int getRows(){
        return this.rows;
    }

    public int getColumns(){
        return this.columns;
    }

    public Color getCoordinate(int i, int j){
        return board[i][j];
    }
}

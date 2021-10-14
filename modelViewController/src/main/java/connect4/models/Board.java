package connect4.models;

import connect4.types.Color;
import connect4.types.Coordinate;
import connect4.types.Direction;
import connect4.types.GameStatus;

public class Board {
    private Color[][] board;

    public Board(){
        board = new Color[Coordinate.NUMROWS][Coordinate.NUMCOLUMNS];
        for(int i=0; i<Coordinate.NUMROWS; i++){
            for(int j=0; j<Coordinate.NUMCOLUMNS; j++){
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
        }while(!isPut && i < Coordinate.NUMROWS);
    }

    public GameStatus checkGameStatus(){
        boolean fullBoard = true;
        for(int i=0; i<Coordinate.NUMROWS; i++){
            for(int j=0; j<Coordinate.NUMCOLUMNS; j++) {
                Coordinate coordinate = new Coordinate(i, j);
                if(!getCoordinateColor(coordinate).isNull()){
                    if (checkCell(coordinate)) return GameStatus.WIN;
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

    public boolean checkCell(Coordinate coordinate){
        return checkDirection(coordinate, Direction.DIAGONAL)
        || checkDirection(coordinate, Direction.VERTICAL)
        || checkDirection(coordinate, Direction.HORIZONTAL)
        || checkDirection(coordinate, Direction.INVERSEDIAGONAL);
    }

    public boolean checkDirection(Coordinate coordinate, Direction direction){
        Coordinate nextCoordinate = coordinate.nextCoordinate(direction);
        for(int i=1; i<4; i++){
            if(!nextCoordinate.isValid() ||
                    getCoordinateColor(coordinate) != getCoordinateColor(nextCoordinate)){
                return false;
            }
            nextCoordinate = nextCoordinate.nextCoordinate(direction);
        }
        return true;
    }

    public boolean checkColumnFree(int column) {
        for(int i = 0; i<Coordinate.NUMROWS; i++){
            if(board[i][column].isNull()){
                return true;
            }
        }
        return false;
    }

    public Color getCoordinateColor(int i, int j){
        return board[i][j];
    }

    public Color getCoordinateColor(Coordinate coordinate){
        return board[coordinate.getRow()][coordinate.getColumn()];
    }
}

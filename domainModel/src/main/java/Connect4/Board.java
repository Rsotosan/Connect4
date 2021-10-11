package Connect4;

public class Board {
    private final int rows = 6;
    private final int columns = 8;
    private int [][] board;

    public Board(){
        board = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                board[i][j] = 0;
            }
        }
    }

    public void print(){
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void put(int column, int color){
        boolean isPut = false;
        int i = rows-1;
        do{
            if(board[i][column] == 0){
                board[i][column] = color;
                isPut = true;
            }
            i--;
        }while(!isPut && i >= 0);
    }

    public GameStatus checkGameStatus(){
        boolean fullBoard = true;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++) {
                if(board[i][j] != 0){
                    if (checkCell(i, j) != 0) return GameStatus.WIN;
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

    public int checkCell(int row, int column){
        int horizontal = 0;
        int vertical = 0;
        int diagonalRight = 0;
        int diagonalLeft = 0;
        for(int i=1; i<4; i++){
            if((column+i) < columns && board[row][column+i] == board[row][column]) horizontal++;
            if((row+i) < rows && board[row+1][column] == board[row][column]) vertical++;
            if((row+i) < rows && (column+i) < columns && board[row+i][column+i] == board[row][column]) diagonalRight++;
            if((row+i) < rows && (column-i) > 0 && board[row+i][column-i] == board[row][column]) diagonalLeft++;
        }
        if(horizontal == 3 || vertical == 3 || diagonalLeft == 3 || diagonalRight == 3){
            return board[row][column];
        }
        return 0;
    }

    public boolean checkColumnFree(int column) {
        for(int i = 0; i<rows; i++){
            if(board[i][column]==0){
                return true;
            }
        }
        return false;
    }
}

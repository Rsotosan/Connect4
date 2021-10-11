package Connect4;

public class Connect4 {
    private Turn turn;
    private Board board;
    private GameStatus gameStatus;

    private boolean gameOver = false;

    public Connect4(){
        turn = new Turn();
        board = new Board();
    }
    public void play(){
        Player activePlayer;
        do{
            activePlayer = turn.getActivePlayer();
            board.print();
            int column = activePlayer.getPut(board);
            while(!board.checkColumnFree(column)){
                this.printColumnError();
                column = activePlayer.getPut(board);
            }
            board.put(column, activePlayer.getColor());
            gameStatus = board.checkGameStatus();
            if(gameStatus == GameStatus.PLAYING) turn.nextTurn();
        } while(gameStatus == GameStatus.PLAYING);

        if(gameStatus == GameStatus.WIN){
            printWinner(activePlayer);
        } else if (gameStatus == GameStatus.DRAW){
            printDraw();
        }
    }

    public void printWinner(Player player){
        board.print();
        System.out.println("El jugador ganador ha sido: " + player.getColor());
    }

    public void printDraw(){
        board.print();
        System.out.println("El juego ha quedado en empate.");
    }

    public void printColumnError(){
        System.out.println("La columna introducida no es correcta.");
    }

    public static void main(String[] args) {
        new Connect4().play();
    }
}

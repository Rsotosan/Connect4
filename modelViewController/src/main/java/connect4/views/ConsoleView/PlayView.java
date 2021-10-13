package connect4.views.ConsoleView;

import connect4.controllers.PlayController;
import connect4.types.GameStatus;
import connect4.views.Message;

public class PlayView {

    private PlayController playController;

    public PlayView(PlayController playController){
        this.playController = playController;
    }

    public void interact(){
        doTurn();
        finishGame();
    }

    private void doTurn(){
        GameStatus gameStatus;
        do{
            new BoardView().print(this.playController);
            new PlayerView(this.playController).interact();
            gameStatus = this.playController.getGameStatus();
            if(gameStatus == GameStatus.PLAYING) new TurnView().nextTurn(this.playController);
        }while(gameStatus == GameStatus.PLAYING);
    }

    private void finishGame(){
        new BoardView().print(this.playController);
        if(this.playController.getGameStatus() == GameStatus.DRAW){
            System.out.println(Message.DRAW);
        } else {
            System.out.println(Message.WIN + "" +  this.playController.getActivePlayer());
        }
    }
}

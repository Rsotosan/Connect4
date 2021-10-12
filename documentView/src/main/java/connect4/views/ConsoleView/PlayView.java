package connect4.views.ConsoleView;

import connect4.models.Game;
import connect4.models.Turn;
import connect4.types.GameStatus;
import connect4.views.Message;
import connect4.views.ViewWithGame;

public class PlayView extends ViewWithGame {

    public PlayView(Game game){
        super(game);
    }

    public void interact(){
        doTurn();
        finishGame();
    }

    private void doTurn(){
        GameStatus gameStatus;
        do{
            new BoardView().print(this.game);
            new PlayerView(this.game).interact();
            gameStatus = this.game.getGameStatus();
            if(gameStatus == GameStatus.PLAYING) new TurnView().nextTurn(this.game);
        }while(gameStatus == GameStatus.PLAYING);
    }

    private void finishGame(){
        new BoardView().print(this.game);
        if(game.getGameStatus() == GameStatus.DRAW){
            System.out.println(Message.DRAW);
        } else {
            System.out.println(Message.WIN + "" +  game.getActivePlayer());
        }
    }
}

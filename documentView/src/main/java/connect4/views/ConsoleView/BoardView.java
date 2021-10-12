package connect4.views.ConsoleView;

import connect4.models.Game;
import connect4.types.Color;

public class BoardView {

    public void print(Game game){
        for(int i=game.getNumRows()-1; i>=0; i--){
            for(int j=0; j<game.getNumColumns(); j++){
                System.out.print(game.getCoordinate(i,j) + " ");
            }
            System.out.println();
        }
    }
}

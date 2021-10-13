package connect4.views.ConsoleView;

import connect4.controllers.PlayController;

public class BoardView {

    public void print(PlayController playController){
        for(int i=playController.getNumRows()-1; i>=0; i--){
            for(int j=0; j<playController.getNumColumns(); j++){
                System.out.print(playController.getCoordinate(i,j) + " ");
            }
            System.out.println();
        }
    }
}

package peter.game.ticTacToe.strategy;

import peter.game.ticTacToe.controller.TTTBoardModel;

/**
 * Created by Piotr Kulma on 01.04.15.
 */
public class TTTComputerNaiveStrategy implements TTTComputerStrategy {
    @Override
    public void performMove(TTTBoardModel model) {
        for(int i=0; i<TTTBoardModel.BOARD_SIZE; i++) {
            if(model.getField(i) == TTTBoardModel.BoardField.BOARD_FIELD_EMPTY) {
                model.setField(i, model.getComputerPlayer());
                break;
            }
        }
    }
}

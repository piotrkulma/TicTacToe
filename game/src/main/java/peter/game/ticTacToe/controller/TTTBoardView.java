package peter.game.ticTacToe.controller;

import java.text.MessageFormat;

/**
 * Created by Piotr Kulma on 01.04.15.
 */
public class TTTBoardView {
    public TTTBoardView() {
    }

    public void visualize(TTTBoardModel model) {
        System.out.println(MessageFormat.format("|{0}|{1}|{2}|", model.getField(0), model.getField(1), model.getField(2)));
        System.out.println(MessageFormat.format("|{0}|{1}|{2}|", model.getField(3), model.getField(4), model.getField(5)));
        System.out.println(MessageFormat.format("|{0}|{1}|{2}|", model.getField(6), model.getField(7), model.getField(8)));
        System.out.println();
    }
}

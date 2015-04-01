package peter.game.ticTacToe;

import peter.game.ticTacToe.controller.TTTBoardController;

/**
 * Created by Piotr Kulma on 01.04.15.
 */
public class Main {
    public static void main(String... args) {
        TTTBoardController controller = new TTTBoardController();

        Thread mainThread = new Thread(controller);
        mainThread.start();
    }
}

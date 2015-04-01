package peter.game.ticTacToe.controller;

import peter.game.ticTacToe.strategy.TTTComputerNaiveStrategy;
import peter.game.ticTacToe.strategy.TTTComputerStrategy;

import java.util.Scanner;

/**
 * Created by Piotr Kulma on 01.04.15.
 */
public class TTTBoardController implements Runnable{
    private TTTBoardModel model;
    private TTTBoardView view;
    private TTTComputerStrategy strategy;
    private Scanner scanner;

    public TTTBoardController() {
        initFields();
    }

    @Override
    public void run() {
        String command;
        while(true) {
            try {
                showView();
                command = scanner.nextLine();
                processCommand(command);
                strategy.performMove(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void processCommand(String command) {
        int index;

        try {
            index = Integer.parseInt(command);
        } catch(NumberFormatException nfe) {
            index = -1;
        }

        if(index == -1 || index <1 || index > 9) {
            System.out.println("Błędna wartość pola. Wymagana wartość to 1-9.");
        } else {
            model.setField(--index, model.getHumanPlayer());
        }
    }

    private void showView() {
        view.visualize(model);
    }

    private void initFields() {
        view = new TTTBoardView();
        model = new TTTBoardModel(TTTBoardModel.BoardField.BOARD_FIELD_O, TTTBoardModel.BoardField.BOARD_FIELD_X);
        strategy = new TTTComputerNaiveStrategy();
        scanner = new Scanner(System.in);
    }
}

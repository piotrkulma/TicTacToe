package peter.game.ticTacToe.controller;

/**
 * Created by Piotr Kulma on 01.04.15.
 */
public class TTTBoardModel {
    public static final int BOARD_SIZE = 9;

    private BoardField[] board;

    private TTTBoardModel.BoardField computerPlayer = TTTBoardModel.BoardField.BOARD_FIELD_X;
    private TTTBoardModel.BoardField humanPlayer = TTTBoardModel.BoardField.BOARD_FIELD_O;

    public enum BoardField {
        BOARD_FIELD_EMPTY,
        BOARD_FIELD_O,
        BOARD_FIELD_X;

        @Override
        public String toString() {
            switch(this) {
                case BOARD_FIELD_O: return "O";
                case BOARD_FIELD_X: return "X";
                default:return " ";
            }
        }
    }

    public TTTBoardModel(TTTBoardModel.BoardField computerPlayer, TTTBoardModel.BoardField humanPlayer) {
        this.computerPlayer = computerPlayer;
        this.humanPlayer = humanPlayer;

        initBoard();
    }

    private void initBoard() {
        board = new BoardField[BOARD_SIZE];

        for(int i=0; i< board.length; i++) {
            board[i] = BoardField.BOARD_FIELD_EMPTY;
        }
    }

    public void setField(int index, BoardField field) {
        board[index] = field;
    }


    public BoardField getField(int index) {
        return board[index];
    }


    public TTTBoardModel.BoardField getComputerPlayer() {
        return computerPlayer;
    }

    public TTTBoardModel.BoardField getHumanPlayer() {
        return humanPlayer;
    }
}

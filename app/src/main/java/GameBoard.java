package tictactoe;

public class GameBoard {

    // We assume that the board is square 3x3
    private static final int BOARD_SIDE = 3;
    private char[][] gameBoard;

    public GameBoard(){
        gameBoard = new char[BOARD_SIDE][BOARD_SIDE];
    }

    public void setBoard(String input) {
        // Check is string BOARD_SIDE*BOARD_SIDE and consists of PIECES
        // Iterate through string and check if char is a PIECE
        int counter = 0; // Init counter to go through String input
        for(int i = 0; i < BOARD_SIDE; ++i) {
            for(int j = 0; j < BOARD_SIDE; ++j) {
                this.gameBoard[i][j] = input.charAt(counter++);
            }
        }
    }

    public void printBoard() {
        System.out.println("---------");
        for(int i = 0; i < BOARD_SIDE; ++i) {
            System.out.print("| ");
            for(int j = 0; j < BOARD_SIDE; ++j) {
                System.out.print(this.gameBoard[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
}

package tictactoe;
import java.util.Scanner;


class Main {

    private static final int BOARD_SIDE = 3;
    private char[][] gameBoard;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[BOARD_SIDE][BOARD_SIDE];

        // Ask user for input, check if correct, if not ask again
        System.out.println("Enter the board: (use 'X', 'O' and '_' for blanks");
        while (true) {
            String input = scanner.nextLine();
            if (input.matches("^[O_X]+$") && input.length() == 9) {
                setBoard(input, board);
                break;
            } else {
                System.out.println("Please enter the cells only using '0', '_', 'X' - 9 times total!");
            }
        }

        // Print the board
        printBoard(board);
    }


    static public void setBoard(String input, char[][] board) {
        // Check is string BOARD_SIDE*BOARD_SIDE and consists of PIECES
        // Iterate through string and check if char is a PIECE
        int counter = 0; // Init counter to go through String input
        for(int i = 0; i < BOARD_SIDE; ++i) {
            for(int j = 0; j < BOARD_SIDE; ++j) {
                board[i][j] = input.charAt(counter++);
            }
        }
    }

    static public void printBoard(char[][] board) {
        System.out.println("---------");
        for(int i = 0; i < BOARD_SIDE; ++i) {
            System.out.print("| ");
            for(int j = 0; j < BOARD_SIDE; ++j) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
}

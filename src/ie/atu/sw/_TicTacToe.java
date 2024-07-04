package ie.atu.sw;


import java.util.Scanner;

	public class _TicTacToe {
		public static void main(String[] args) {
	        runGame();
	    }

	    public static void runGame() {
	        String[][] gameBoard = new String[3][3];
	        initializeGameBoard(gameBoard);
	        printCurrentBoard(gameBoard);

	        boolean xTurn = true;
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            getUserInput(xTurn, gameBoard, scanner);
	            printCurrentBoard(gameBoard);

	            String winner = getWinner(gameBoard);
	            if (!winner.isEmpty()) {
	                System.out.println("Player " + winner + " wins!");
	                break;
	            } else if (isBoardFull(gameBoard)) {
	                System.out.println("It's a draw!");
	                break;
	            }

	            xTurn = !xTurn;
	        }

	        scanner.close();
	    }

	    public static void initializeGameBoard(String[][] gameBoard) {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                gameBoard[i][j] = "-";
	            }
	        }
	    }

	    public static void printCurrentBoard(String[][] gameBoard) {
	        System.out.println("-------------");
	        for (int i = 0; i < 3; i++) {
	            System.out.print("| ");
	            for (int j = 0; j < 3; j++) {
	                System.out.print(gameBoard[i][j] + " | ");
	            }
	            System.out.println();
	            System.out.println("-------------");
	        }
	    }

	    public static void getUserInput(boolean xTurn, String[][] gameBoard, Scanner scanner) {
	        String player = xTurn ? "X" : "O";
	        int row, col;
	        while (true) {
	            System.out.println("Player " + player + "'s turn.");
	            System.out.print("Enter row (0-2): ");
	            row = scanner.nextInt();
	            System.out.print("Enter column (0-2): ");
	            col = scanner.nextInt();

	            if (row >= 0 && row < 3 && col >= 0 && col < 3 && gameBoard[row][col].equals("-")) {
	                gameBoard[row][col] = player;
	                break;
	            } else {
	                System.out.println("Invalid move! Try again.");
	            }
	        }
	    }

	    public static String getWinner(String[][] gameBoard) {
	        for (int i = 0; i < 3; i++) {
	            if (gameBoard[i][0].equals(gameBoard[i][1]) && gameBoard[i][0].equals(gameBoard[i][2]) && !gameBoard[i][0].equals("-")) {
	                return gameBoard[i][0];
	            }
	            if (gameBoard[0][i].equals(gameBoard[1][i]) && gameBoard[0][i].equals(gameBoard[2][i]) && !gameBoard[0][i].equals("-")) {
	                return gameBoard[0][i];
	            }
	        }
	        if (gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[0][0].equals(gameBoard[2][2]) && !gameBoard[0][0].equals("-")) {
	            return gameBoard[0][0];
	        }
	        if (gameBoard[0][2].equals(gameBoard[1][1]) && gameBoard[0][2].equals(gameBoard[2][0]) && !gameBoard[0][2].equals("-")) {
	            return gameBoard[0][2];
	        }
	        return "";
	    }

	    public static boolean isBoardFull(String[][] gameBoard) {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (gameBoard[i][j].equals("-")) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	}


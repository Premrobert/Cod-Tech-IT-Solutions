import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		char[][] board = new char[3][3];
		for (int i = 0; i <= board.length - 1; i++) {
			for (int j = 0; j <= board[i].length - 1; j++) {
				board[i][j] = ' ';

			}
		}
		char player = 'X';
		boolean gameOver = false;
		Scanner sc = new Scanner(System.in);

		while (!gameOver) {
			printBoard(board);
			System.out.println("Player " + player + " Enter");
			int row = sc.nextInt();
			int col = sc.nextInt();
			System.out.println();
			
			if (board[row][col] == ' ') {
				board[row][col] = player;
				gameOver = haveWon(board, player);
				if (gameOver) {
					System.out.println("Player " + player + " has Won");
				} else {
//							if(player=='X') {
//								player = 'O';
//							}
//							else {
//									player = 'X';
//								}
				}
				player = (player == 'X') ? 'O' : 'X';
			}
			 else {
				System.out.println("Invalid move!! Please try again");
			}
		}
		
		printBoard(board);
		

	}

	private static boolean haveWon(char[][] board, char player) {
		for (int i = 0; i <= board.length - 1; i++) {
			if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
				return true;
			}
		}
		for (int j = 0; j <= board[0].length - 1; j++) {
			if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
				return true;
			}
		}
		if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
			return true;
		}
		if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
			return true;
		}
		return false;
	}

	private static void printBoard(char[][] board) {
		for (int i = 0; i <= board.length - 1; i++) {
			for (int j = 0; j <= board[i].length - 1; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
		}
	}
}

package is.ru.tictactoe;

public class Board {
	
	private static char[][] board;
	private static final int SIZE = 3;

	public static void boards() {
		board = new char[SIZE][SIZE];
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				board[i][j] = ' ';
			}
		}
	}

	public static int boardSize() {
		return SIZE;
	}
}
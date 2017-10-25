package is.ru.tictactoe;

public class TicTacToe {

	public static int test(String text) {
		if(text == "") {
			return 0;
		}
		return -1;
	}

	public static void main(String[] args) {
		test("");
	}
}
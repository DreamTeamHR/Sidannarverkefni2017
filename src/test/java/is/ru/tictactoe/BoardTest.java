package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest {
	
	@Test
	public void testBoardSize() {
		assertEquals(3, Board.boardSize());
	}
}
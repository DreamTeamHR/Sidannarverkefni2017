package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest {
	
	@Test
	public void testEmptyString() {
		assertEquals(0, Board.test(""));
	}

}
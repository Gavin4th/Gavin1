import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class newGameTest {
	private static newGame game = new newGame();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNewGame() {
		assertEquals(532, game.getSize().width);
		assertEquals(535, game.getSize().height);
		assertEquals("ÉúÃüÓÎÏ·", game.getTitle());
	}

}

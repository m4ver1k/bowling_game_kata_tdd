import com.m4ver1k.pinball.Game;
import junit.framework.TestCase;

/**
 * Created by m4ver1k on 29/1/17.
 */
public class BowlingGameTest extends TestCase {

    private Game game;

    public void setUp() throws Exception {
        super.setUp();
        game = new Game();
    }

    public void testGutterGame(){
        rollMany(0, 20);
        assertEquals(0,game.getScore());
    }

    public void testAllOneGame(){
        rollMany(1, 20);
        assertEquals(20, game.getScore());
    }

    private void rollMany(int pins, int n) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }
}

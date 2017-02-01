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

    public void testOneSpare(){
        rollSpare();
        game.roll(3);
        rollMany(0,17);
        assertEquals(16,game.getScore());
    }

    public void testOneStrike(){
        rollStrike();
        game.roll(4);
        game.roll(4);
        rollMany(0,17);

        assertEquals(26,game.getScore());
    }

    public void testPerfectGame(){
        rollMany(10,20);

        assertEquals(300,game.getScore());
    }
    private void rollStrike() {
        game.roll(10);
    }

    private void rollMany(int pins, int n) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }

    private void rollSpare(){
        game.roll(5);
        game.roll(5);
    }
}

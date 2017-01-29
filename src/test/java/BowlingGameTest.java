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
        for(int i =0;i<20;i++){
            game.roll(0);
        }
        assertEquals(0,game.getScore());
    }

    public void testAllOneGame(){
        for(int i =0;i<20;i++){
            game.roll(1);
        }
        assertEquals(20, game.getScore());
    }
}

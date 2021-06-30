package game;

import org.junit.Test;

public class TestPlay {

    @Test
    public void testPlay(){
        Game game = new Game(4,100,10);
        game.play();
    }
}

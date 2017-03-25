package cz.karelstefan.coderetreat;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameOfLifeTest {

    @Test(expected = UnsupportedOperationException.class)
    public void playHasNotImplementation() {
        GameOfLife game = new GameOfLife();
        game.play();
    }
}

package arena;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ArenaTest {
    private Player playerA;
    private Player playerB;
    private Arena arena;

    @Before
    public void setUp() {
        playerA = new Player("Player A", 50, 5, 10);
        playerB = new Player("Player B", 100, 10, 5);
        arena = new Arena(playerA, playerB);
    }

    @Test
    public void testBattle() {
        arena.startBattle();
        assertTrue(playerA.getHealth() == 0 || playerB.getHealth() == 0);
    }
}

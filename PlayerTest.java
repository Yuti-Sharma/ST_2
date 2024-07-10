package arena;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player("Test Player", 100, 10, 5);
    }

    @Test
    public void testInitialHealth() {
        assertEquals(100, player.getHealth());
    }

    @Test
    public void testReduceHealth() {
        player.reduceHealth(20);
        assertEquals(80, player.getHealth());
    }

    @Test
    public void testIsAlive() {
        assertTrue(player.isAlive());
        player.reduceHealth(100);
        assertFalse(player.isAlive());
    }
}

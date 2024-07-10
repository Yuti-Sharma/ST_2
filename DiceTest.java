package arena;

import static org.junit.Assert.*;
import org.junit.Test;

public class DiceTest {
    @Test
    public void testRoll() {
        Dice dice = new Dice();
        for (int i = 0; i < 100; i++) {
            int roll = dice.roll();
            assertTrue(roll >= 1 && roll <= 6);
        }
    }
}

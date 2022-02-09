import Summons.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {
    private Dragon dragon;

    @Before
    public void before() {
        dragon = new Dragon(30, 50);
    }

    @Test
    public void hasValues() {
        assertEquals(30, dragon.getDamage());
        assertEquals(50, dragon.getHealthPoints());
    }
}

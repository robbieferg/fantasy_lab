import HealingItems.EstusFlask;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EstusFlaskTest {
    private EstusFlask estusFlask;

    @Before
    public void before() {
        estusFlask = new EstusFlask(23);
    }

    @Test
    public void hasHealValue() {
        assertEquals(23, estusFlask.getHealValue());
    }
}

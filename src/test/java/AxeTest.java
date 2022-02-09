import Weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {
    private Axe axe;

    @Before
    public void before() {
        this.axe = new Axe(15);
    }

    @Test
    public void hasDamage() {
        assertEquals(15, axe.getDamage());
    }

}

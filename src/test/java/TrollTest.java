import Enemies.Troll;
import Weapons.Axe;
import Weapons.Sword;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    private Troll troll;
    private Axe axe;
    private Sword sword;

    @Before
    public void before() {
        axe = new Axe(48);
        sword = new Sword(30);
        troll = new Troll(85, axe);
    }


    @Test
    public void hasHealthPoints() {
        assertEquals(85, troll.getHealthPoints());
    }

    @Test
    public void hasWeapon() {
        assertEquals(axe, troll.getWeapon());
    }

    @Test
    public void canTakeDamage() {
        troll.takeDamage(15);
        assertEquals(70, troll.getHealthPoints());
    }

    @Test
    public void canChangeWeapon() {
        troll.setWeapon(sword);
        assertEquals(sword, troll.getWeapon());
    }
}

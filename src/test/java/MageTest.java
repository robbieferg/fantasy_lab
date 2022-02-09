import Enemies.Orc;
import Players.Spells.Fireball;
import Players.Spells.Spells;
import Players.Warlock;
import Summons.Dragon;
import Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MageTest {

    private Orc orc;
    private Warlock warlock;
    private Fireball fireball;
    private Club club;
    private Dragon dragon;

    @Before
    public void before(){
        club = new Club(20);
        orc = new Orc(50, club);
        dragon = new Dragon(30, 100);
        warlock = new Warlock("Gandalf", 60, 4, 10, 6, dragon, 100);
        fireball = new Fireball(20, 30);
    }

    @Test
    public void canCastFireball(){
        warlock.cast(orc, fireball);
        assertEquals(20, orc.getHealthPoints());
        assertEquals(80, warlock.getManaPoints());
    }


}

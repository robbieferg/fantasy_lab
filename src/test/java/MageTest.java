import Enemies.Orc;
import Players.Spells.Spells;
import Players.Warlock;
import Summons.Dragon;
import Weapons.Club;
import org.junit.Before;

public class MageTest {

    private Orc orc;
    private Warlock warlock;
    private Spells fireball;
    private Club club;
    private Dragon dragon;

    @Before
    public void before(){
        club = new Club(20);
        orc = new Orc(50, club);
        dragon = new Dragon(30, 100);
        warlock = new Warlock("Gandalf", 60,  )
    }
}

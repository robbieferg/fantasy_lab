import Enemies.Orc;
import Enemies.Troll;
import HealingItems.EstusFlask;
import Players.Barbarian;
import Players.Cleric;
import Players.Dwarf;
import Players.Knight;
import Weapons.Axe;
import Weapons.Club;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {
    private Sword sword1;
    private Sword sword2;
    private Axe axe;
    private Club club;
    private Knight knight;
    private Dwarf dwarf;
    private Barbarian barbarian;
    private Orc orc;
    private EstusFlask flask;
    private Cleric cleric;
    private Troll troll;

    @Before
    public void before() {
        sword1 = new Sword(55);
        sword2 = new Sword(35);
        axe = new Axe(60);
        club = new Club(40);
        knight = new Knight("Guts", 75, sword1, 9, 5, 5);
        dwarf = new Dwarf("Gimli", 65, axe, 8, 6, 4);
        barbarian = new Barbarian("Fred", 70, club, 7, 7, 7);
        orc = new Orc(55, sword2);
        flask = new EstusFlask(15);
        cleric = new Cleric("Radagast", 60, 4, 8, 6, 20);
        troll = new Troll(75, axe);


    }

    @Test
    public void canAttackAndWoundWithMultiplier() {
        knight.attack(troll);
        assertEquals(11, troll.getHealthPoints());
        assertEquals(true, troll.getIsAlive());
        assertEquals(true, knight.getIsAlive());

    }

    @Test
    public void canAttackAndKill() {
        knight.attack(orc);
        assertEquals(0, orc.getHealthPoints());
        assertEquals(false, orc.getIsAlive());
    }

    @Test
    public void canUseHealingItem(){
        orc.attack(knight);
        knight.useHeal(flask);
        assertEquals(55, knight.getHealthPoints());
    }

    @Test
    public void clericCanHeal(){
        orc.attack(knight);
        cleric.heal(knight);
        assertEquals(60, knight.getHealthPoints());
    }

//    @Test
//    public void canLevelUp() {
//        knight.levelUp();
//    }





}

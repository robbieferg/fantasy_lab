package Players;

import Summons.Summon;
import Weapons.Weapon;

public class Warlock extends Mage{

    public Warlock(String name, int healthPoints, int strength, int intelligence, int agility, Summon summon, int manaPoints) {
        super(name, healthPoints, strength, intelligence, agility, summon, manaPoints);
    }
}

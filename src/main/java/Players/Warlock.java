package Players;

import Summons.Summon;
import Weapons.Weapon;

public class Warlock extends Mage{

    public Warlock(String name, int healthPoints, Weapon weapon, int strength, int intelligence, int agility, Summon summon, int manaPoints) {
        super(name, healthPoints, weapon, strength, intelligence, agility, summon, manaPoints);
    }
}

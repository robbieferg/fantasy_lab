package Players;

import Enemies.Enemy;
import Enemies.Orc;
import HealingItems.EstusFlask;
import HealingItems.HealingItem;
import Weapons.Weapon;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Fighter extends Player {
    private Weapon weapon;

    public Fighter(String name, int healthPoints,  Weapon weapon, int strength, int intelligence, int agility) {
        super(name, healthPoints, strength, intelligence, agility);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        ArrayList<Integer> attributes = new ArrayList<Integer>();
        attributes.add(this.getStrength());
        attributes.add(this.getIntelligence());
        attributes.add(this.getAgility());
        int max = Collections.max(attributes);
        enemy.takeDamage(this.getWeapon().getDamage() + max);
    }

    public void useHeal(HealingItem healingItem) {
        this.setHealthPoints(getHealthPoints() + healingItem.getHealValue());
    }
}

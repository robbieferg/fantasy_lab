package Players;

import Enemies.Enemy;
import Enemies.Orc;
import HealingItems.EstusFlask;
import HealingItems.HealingItem;
import Weapons.Weapon;

public abstract class Fighter extends Player {
    private Weapon weapon;

    public Fighter(String name, int healthPoints, Weapon weapon, int strength, int intelligence, int agility, Weapon weapon1) {
        super(name, healthPoints, weapon, strength, intelligence, agility);
        this.weapon = weapon1;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(this.getWeapon().getDamage());
    }

    public void useHeal(HealingItem healingItem) {
        this.setHealthPoints(getHealthPoints() + healingItem.getHealValue());
    }
}

package Enemies;

import Weapons.IWeapon;
import Weapons.Weapon;

public abstract class Enemy implements IWeapon {
    private int healthPoints;
    private Weapon weapon;

    public Enemy(int healthPoints, Weapon weapon) {
        this.healthPoints = healthPoints;
        this.weapon = weapon;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {

    }

    public void takeDamage(int damage) {
        this.setHealthPoints(healthPoints -= damage);
    }


}

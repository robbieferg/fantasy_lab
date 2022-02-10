package Enemies;

import Players.Player;
import Weapons.ITakeDamage;
import Weapons.IWeapon;
import Weapons.Weapon;

public abstract class Enemy implements ITakeDamage {
    private int healthPoints;
    private Weapon weapon;
    private boolean isAlive;

    public Enemy(int healthPoints, Weapon weapon) {
        this.healthPoints = healthPoints;
        this.weapon = weapon;
        this.isAlive = true;
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

    public boolean getIsAlive() {
        return isAlive;
    }



    public void setIsAlive(boolean alive) {
        isAlive = alive;
    }

    public void attack(Player player) {
        player.takeDamage(this.getWeapon().getDamage());
    }

    public void takeDamage(int damage) {
        if (healthPoints - damage <= 0) {
            this.setHealthPoints(0);
            this.setIsAlive(false);
        }
        else {
            this.setHealthPoints(healthPoints -= damage);
        }

    }


}

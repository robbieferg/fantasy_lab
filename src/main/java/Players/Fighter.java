package Players;

import Enemies.Enemy;
import Enemies.Orc;
import Weapons.Weapon;

public abstract class Fighter extends Player {
    private Weapon weapon;
    private int strength;
    private int intelligence;
    private int agility;

    public Fighter(String name, int healthPoints, Weapon weapon, int strength, int intelligence, int agility) {
        super(name, healthPoints);
        this.weapon = weapon;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(this.getWeapon().getDamage());
    }
}

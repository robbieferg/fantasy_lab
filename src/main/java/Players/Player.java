package Players;

import Weapons.ITakeDamage;
import Weapons.Weapon;

public abstract class Player implements ITakeDamage {
    private String name;
    private int healthPoints;
    private Weapon weapon;
    private int strength;
    private int intelligence;
    private int agility;

    public Player(String name, int healthPoints, Weapon weapon, int strength, int intelligence, int agility) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.weapon = weapon;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void takeDamage(int damage){
        setHealthPoints(this.healthPoints -= damage);
    }
}

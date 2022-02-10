package Players;

import Weapons.ITakeDamage;
import Weapons.Weapon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class Player implements ITakeDamage {
    private String name;
    private int healthPoints;
    private int strength;
    private int intelligence;
    private int agility;
    private boolean isAlive;
    private ArrayList<Integer> chances;

    public Player(String name, int healthPoints, int strength, int intelligence, int agility) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.isAlive = true;
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

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean alive) {
        isAlive = alive;
    }

    public void takeDamage(int damage){
        if (this.healthPoints - damage <= 0) {
            this.setHealthPoints(0);
        }
        else {
            this.setHealthPoints(this.healthPoints - damage);
        }

    }

    public void levelUp() {
        ArrayList<Integer> chances = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Random diceRoll = new Random();
        int number = chances.get(diceRoll.nextInt(chances.size()));

        if (this instanceof Knight) {
            if (number > 0 && number <= 5) {
                this.setStrength(this.getStrength() + 1);
            }
            else {

            }





        }

    }
}

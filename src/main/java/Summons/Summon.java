package Summons ;

public abstract class Summon implements IDefend {

    private int damage;
    private int healthPoints;

    public Summon(int damage, int healthPoints) {
        this.damage = damage;
        this.healthPoints = healthPoints;
    }

    public void defend() {

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}

package Weapons;

public abstract class Weapon implements IWeapon {
    private int damage;

    public Weapon(int damage) {
        this.damage = damage;
    }

    public void attack() {

    };

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

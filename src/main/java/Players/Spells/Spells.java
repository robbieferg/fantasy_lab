package Players.Spells;


public abstract class Spells {

    private int manaCost;
    private int damage;

    public Spells(int manaCost, int damage) {
        this.manaCost = manaCost;
        this.damage = damage;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

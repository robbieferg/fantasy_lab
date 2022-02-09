package Players;

import Enemies.Enemy;
import Players.Spells.Spells;
import Summons.Summon;

public abstract class Mage extends Player implements ISpell {

    private Summon summon;
    private int manaPoints;

    public Mage(String name, int healthPoints, int strength, int intelligence, int agility, Summon summon, int manaPoints) {
        super(name, healthPoints, strength, intelligence, agility);
        this.summon = summon;
        this.manaPoints = manaPoints;
    }

    public Summon getSummon() {
        return summon;
    }

    public void setSummon(Summon summon) {
        this.summon = summon;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public void cast(Enemy enemy, Spells spell){
        enemy.setHealthPoints(enemy.getHealthPoints() - spell.getDamage());
        this.setManaPoints(getManaPoints() - spell.getManaCost());
    }
}

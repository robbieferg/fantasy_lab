package Players;

import HealingItems.IHeal;

public class Cleric extends Player implements IHeal {

    private int healAmount;

    public Cleric(String name, int healthPoints, int strength, int intelligence, int agility, int healAmount) {
        super(name, healthPoints, strength, intelligence, agility);
        this.healAmount = healAmount;
    }

    public int getHealAmount() {
        return healAmount;
    }

    public void setHealAmount(int healAmount) {
        this.healAmount = healAmount;
    }

    public void heal(Player player){
        player.setHealthPoints(player.getHealthPoints() + getHealAmount());
    }
}

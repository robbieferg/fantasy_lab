package HealingItems;

public abstract class HealingItem implements IHeal {
    private int healValue;

    public HealingItem(int healValue) {
        this.healValue = healValue;
    }

    public void heal() {

    }

    public int getHealValue() {
        return healValue;
    }

    public void setHealValue(int healValue) {
        this.healValue = healValue;
    }
}

package HealingItems;

public abstract class HealingItem {
    private int healValue;

    public HealingItem(int healValue) {
        this.healValue = healValue;
    }

    public int getHealValue() {
        return healValue;
    }

    public void setHealValue(int healValue) {
        this.healValue = healValue;
    }
}

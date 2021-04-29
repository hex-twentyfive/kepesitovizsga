package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    private int hitPoints;

    private int attackDamage;

    private boolean hasArmor;

    public MilitaryUnit(int hitPoints, int attackDamage, boolean hasArmor) {
        this.hitPoints = hitPoints;
        this.attackDamage = attackDamage;
        this.hasArmor = hasArmor;
    }


    public int doDamage() {
        return this.attackDamage;
    }


    public void sufferDamage(int damage) {
        if (hasArmor) {
            hitPoints -= (damage / 2);
        } else {
            hitPoints -= damage;
        }
    }


    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public boolean isHasArmor() {
        return hasArmor;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setHasArmor(boolean hasArmor) {
        this.hasArmor = hasArmor;
    }

}

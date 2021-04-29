package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit{


    private static final int HIT_POINT = 100;

    private static final int ATTACK_DAMAGE = 10;

    private int defendCounter;


    public Swordsman( boolean hasArmor) {
        super(HIT_POINT, ATTACK_DAMAGE, hasArmor);

        this.defendCounter = 0;
    }


    @Override
    public void sufferDamage(int damage) {
        defendCounter++;
        if (defendCounter != 1) {
            super.sufferDamage(damage);
        }
    }


}
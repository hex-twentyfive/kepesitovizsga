package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {


    private static final int HIT_POINT = 150;

    private static final int ATTACK_DAMAGE = 20;

    private static final boolean HAS_ARMOR = true;

    private int attackCounter;


    public HeavyCavalry() {
        super(HIT_POINT, ATTACK_DAMAGE, HAS_ARMOR);

        this.attackCounter = 0;
    }


    @Override
    public int doDamage() {
        attackCounter ++;
        if (attackCounter == 1) {
            return ( super.doDamage() * 3 );
        }
        return super.doDamage();
    }


}
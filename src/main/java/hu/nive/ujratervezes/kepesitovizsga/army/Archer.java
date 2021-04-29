package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit{

    private static final int HIT_POINT = 50;
    private static final int ATTACK_DAMAGE = 20;
    private static final boolean HAS_ARMOR = false;



    public Archer() {
        super(HIT_POINT, ATTACK_DAMAGE, HAS_ARMOR);

//        super.setHitPoint(150);
//        super.setAttackDamage(20);
//        super.setHasArmor(true);
    }

    @Override
    public int doDamage() {
        return super.doDamage();
    }

    @Override
    public void sufferDamage(int damage) {
        super.sufferDamage(damage);
    }

    @Override
    public int getHitPoints() {
        return super.getHitPoints();
    }
}

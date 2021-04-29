package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> army = new ArrayList<>();


    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (MilitaryUnit e : army) {
            e.sufferDamage(damage);
        }
        removesIncapacitatedAndDead();
    }

    private void removesIncapacitatedAndDead() {
        List<MilitaryUnit> removedArmy = new ArrayList<>();
        for (MilitaryUnit e : army) {
            if (e.getHitPoints() >= 25) {
                removedArmy.add(e);
            }
        }
        army = removedArmy;
    }

    public int getArmyDamage() {
        int armyDamageSum = 0;
        for (MilitaryUnit e : army) {
            armyDamageSum += e.doDamage();
        }
        return armyDamageSum;
    }

    public int getArmySize() {
        return army.size();
    }


}

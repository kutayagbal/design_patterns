package bin.main.java.gof.behavioral.strategy.character;

import bin.main.java.gof.behavioral.strategy.weapon.SwordBehavior;

public class King extends Character {
    public King() {
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.print("King is fighting => ");
        weapon.useWeapon();
    }
}

package gof.behavioral.strategy.character;

import gof.behavioral.strategy.weapon.BowAndArrowBehavior;

public class Knight extends Character {
    public Knight() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.print("Knight is fighting => ");
        weapon.useWeapon();
    }

}

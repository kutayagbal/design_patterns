package bin.main.java.gof.behavioral.strategy.character;

import bin.main.java.gof.behavioral.strategy.weapon.KnifeBehavior;

public class Queen extends Character {

    public Queen() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.print("Queen is fighting => ");
        weapon.useWeapon();
    }

}

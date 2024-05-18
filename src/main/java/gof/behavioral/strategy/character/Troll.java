package bin.main.java.gof.behavioral.strategy.character;

import bin.main.java.gof.behavioral.strategy.weapon.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.print("Troll is fighting => ");
        weapon.useWeapon();
    }

}

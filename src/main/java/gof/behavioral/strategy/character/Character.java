package bin.main.java.gof.behavioral.strategy.character;

import bin.main.java.gof.behavioral.strategy.weapon.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }

    public abstract void fight();

}

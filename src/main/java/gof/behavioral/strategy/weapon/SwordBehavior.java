package bin.main.java.gof.behavioral.strategy.weapon;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Swinging a sword!");
    }
}

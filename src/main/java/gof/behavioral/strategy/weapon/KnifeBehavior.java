package bin.main.java.gof.behavioral.strategy.weapon;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Cutting with a knife!");
    }
}

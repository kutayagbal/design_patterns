package gof.behavioral;


public class StrategyTest {
    /*
     * STRATEGY: Defines families of algorithms, encapsulates each one, and makes
     * them interchangeable. Strategy lets the algorithm vary independently from
     * clients that use it.
     * 
     * Encapsulate what varies:
     * Identify the aspects of your application that vary and separate them from
     * what stays the same.
     * 
     * Favor composition over inheritance:
     * Maintainability and extensibility is more important than code reuse.
     * 
     * Program to interfaces, not to implementations.
     */
    public static void main(String[] args) {
        Character king = new King();
        king.fight();

        Character queen = new Queen();
        queen.fight();

        Character knight = new Knight();
        knight.fight();

        Character troll = new Troll();
        troll.fight();

        knight.setWeapon(new SwordBehavior());
        knight.fight();
    }
}

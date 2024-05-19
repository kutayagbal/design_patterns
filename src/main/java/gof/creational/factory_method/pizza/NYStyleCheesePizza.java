package gof.creational.factory_method.pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Goat Cheese Sauce";
        System.out.println("Creating " + name + " with " + dough + " and " + sauce);
    }
}

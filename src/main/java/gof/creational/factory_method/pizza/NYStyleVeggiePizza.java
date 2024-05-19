package gof.creational.factory_method.pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        System.out.println("Creating " + name + " with " + dough + " and " + sauce);
    }
}

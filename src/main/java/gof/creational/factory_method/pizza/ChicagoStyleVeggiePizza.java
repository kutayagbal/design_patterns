package gof.creational.factory_method.pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        System.out.println("Creating " + name + " with " + dough + " and " + sauce);
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

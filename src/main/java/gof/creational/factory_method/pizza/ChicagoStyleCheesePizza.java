package gof.creational.factory_method.pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Mozzarella Sauce";
        System.out.println("Creating " + name + " with " + dough + " and " + sauce);
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

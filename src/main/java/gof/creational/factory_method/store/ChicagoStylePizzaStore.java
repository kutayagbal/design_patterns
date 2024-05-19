package gof.creational.factory_method.store;

import gof.creational.factory_method.pizza.ChicagoStyleCheesePizza;
import gof.creational.factory_method.pizza.ChicagoStyleVeggiePizza;
import gof.creational.factory_method.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }

        return null;
    }
}

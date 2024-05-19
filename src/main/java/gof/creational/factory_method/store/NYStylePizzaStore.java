package gof.creational.factory_method.store;

import gof.creational.factory_method.pizza.NYStyleCheesePizza;
import gof.creational.factory_method.pizza.NYStyleVeggiePizza;
import gof.creational.factory_method.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }

        return null;
    }
}

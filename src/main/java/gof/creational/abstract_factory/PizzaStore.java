package gof.creational.abstract_factory;

import gof.creational.abstract_factory.pizza.CheesePizza;
import gof.creational.abstract_factory.pizza.Pizza;
import gof.creational.abstract_factory.pizza.SeafoodPizza;
import gof.creational.abstract_factory.pizza.VeggiePizza;
import gof.creational.abstract_factory.region.PizzaIngredientFactory;

public class PizzaStore {
    private PizzaIngredientFactory factory;

    public PizzaStore(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(factory);
        } else if (type.equals("seafood")) {
            pizza = new SeafoodPizza(factory);
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(factory);
        }
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}

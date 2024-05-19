package gof.creational.abstract_factory.pizza;

import java.util.List;

import gof.creational.abstract_factory.ingredient.cheese.Cheese;
import gof.creational.abstract_factory.ingredient.dough.Dough;
import gof.creational.abstract_factory.ingredient.sauce.Sauce;
import gof.creational.abstract_factory.ingredient.seafood.Seafood;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Seafood seafood;
    List<String> veggies;

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Placing pizza in official PizzaStore box");
    }
}

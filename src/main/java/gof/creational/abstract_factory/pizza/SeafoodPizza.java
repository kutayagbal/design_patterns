package gof.creational.abstract_factory.pizza;

import gof.creational.abstract_factory.region.PizzaIngredientFactory;

public class SeafoodPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public SeafoodPizza(PizzaIngredientFactory ingredientFactory) {
        name = ingredientFactory.getStyle() + " Seafood Pizza";
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("\nPreparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        seafood = ingredientFactory.createSeafood();
    }
}

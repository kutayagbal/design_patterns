package gof.creational.abstract_factory.pizza;

import gof.creational.abstract_factory.region.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        name = ingredientFactory.getStyle() + " Cheese Pizza";
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("\nPreparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}

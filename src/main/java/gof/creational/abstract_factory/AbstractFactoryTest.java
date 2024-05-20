package gof.creational.abstract_factory;

import gof.creational.abstract_factory.region.LAPizzaIngredientFactory;
import gof.creational.abstract_factory.region.NYPizzaIngredientFactory;

public class AbstractFactoryTest {
    /*
     * ABSTRACT FACTORY: Provides an interface for creating families of related or
     * dependent objects without specifying their concrete classes.
     * 
     * Each abstract method in Abstract Factory is actually a Factory Method.
     * 
     * Factory Method uses inheritance. Abstract method encapsulating creation of
     * product is implemented by subclasses to create different concrete products.
     * 
     * Abstract Factory uses composition. You compose the client with an Abstract
     * Factory and specify concrete factories on runtime to create concrete
     * products using factory methods.
     */
    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new PizzaStore(new NYPizzaIngredientFactory());
        PizzaStore laStylePizzaStore = new PizzaStore(new LAPizzaIngredientFactory());

        nyStylePizzaStore.orderPizza("cheese");
        laStylePizzaStore.orderPizza("cheese");
        nyStylePizzaStore.orderPizza("seafood");
        laStylePizzaStore.orderPizza("veggie");
    }
}

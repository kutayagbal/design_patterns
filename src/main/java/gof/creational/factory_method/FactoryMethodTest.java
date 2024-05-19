package gof.creational.factory_method;

import gof.creational.factory_method.pizza.Pizza;
import gof.creational.factory_method.store.ChicagoStylePizzaStore;
import gof.creational.factory_method.store.NYStylePizzaStore;
import gof.creational.factory_method.store.PizzaStore;

public class FactoryMethodTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza2.getName() + "\n");

        Pizza pizza3 = chicagoStore.orderPizza("veggie");
        System.out.println("Tim ordered a " + pizza3.getName() + "\n");

    }
}

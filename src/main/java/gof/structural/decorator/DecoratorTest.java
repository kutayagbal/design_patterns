package gof.structural.decorator;

import gof.structural.decorator.coffee.Beverage;
import gof.structural.decorator.coffee.DarkRoast;
import gof.structural.decorator.coffee.Espresso;
import gof.structural.decorator.coffee.HouseBlend;
import gof.structural.decorator.condiment.Mocha;
import gof.structural.decorator.condiment.Soy;

public class DecoratorTest {
    /*
     * DECORATOR: Attaches additional responsibilities to an object dynamically.
     * Decorators provide a flexible alternative to subclassing for extending
     * functionality.
     * 
     * Classes should be open for extension but closed for modification.
     * 
     * Each decorator wraps an (HAS-A) instance variable of what it
     * decorates and adds new behaviour to it's behaviour.
     * 
     * Decorator classes mirror the type of the components they decorate to be
     * replacable with them. They are same type throught inheritance or interface
     * implementation.
     */
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.description() + " $" + String.format("%.2f", beverage.cost()));

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.description() + " $" + String.format("%.2f", beverage2.cost()));

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        System.out.println(beverage3.description() + " $" + String.format("%.2f", beverage3.cost()));
    }
}

package gof.structural.decorator.condiment;

import gof.structural.decorator.coffee.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String description() {
        return beverage.description() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + 0.3;
    }
}

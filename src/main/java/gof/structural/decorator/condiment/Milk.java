package gof.structural.decorator.condiment;

import gof.structural.decorator.coffee.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }

    @Override
    public String description() {
        return beverage.description() + ", Milk";
    }
}

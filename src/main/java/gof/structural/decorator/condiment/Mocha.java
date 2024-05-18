package gof.structural.decorator.condiment;

import gof.structural.decorator.coffee.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.4;
    }

    @Override
    public String description() {
        return beverage.description() + ", Mocha";
    }

}

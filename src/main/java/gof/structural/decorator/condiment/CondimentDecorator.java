package gof.structural.decorator.condiment;

import gof.structural.decorator.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public abstract double cost();

    public abstract String description();

}

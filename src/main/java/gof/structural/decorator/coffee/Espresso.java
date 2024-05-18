package gof.structural.decorator.coffee;

public class Espresso extends Beverage {
    @Override
    public String description() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}

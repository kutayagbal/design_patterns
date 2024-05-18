package gof.structural.decorator.coffee;

public class DecafCoffee extends Beverage {
    @Override
    public String description() {
        return "Decaffeinated Coffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
package gof.structural.decorator.coffee;

public class HouseBlend extends Beverage {
    @Override
    public String description() {
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 3.0;
    }
}

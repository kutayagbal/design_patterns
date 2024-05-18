package gof.structural.decorator.coffee;

public class DarkRoast extends Beverage {

    @Override
    public String description() {
        return "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 4.0;
    }
}

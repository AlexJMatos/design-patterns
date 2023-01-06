package decorator.beverage;

import decorator.beverage.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}

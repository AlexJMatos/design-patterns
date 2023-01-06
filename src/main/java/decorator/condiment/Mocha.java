package decorator.condiment;

import decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        switch (getSize()) {
            case TALL:
                cost += 0.15;
                break;
            case GRANDE:
                cost += 0.20;
                break;
            case VENTI:
                cost += 0.25;
                break;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}

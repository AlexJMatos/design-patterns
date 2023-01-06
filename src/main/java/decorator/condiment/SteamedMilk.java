package decorator.condiment;

import decorator.beverage.Beverage;

public class SteamedMilk extends CondimentDecorator {

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        switch (getSize()) {
            case TALL:
                cost += 0.05;
                break;
            case GRANDE:
                cost += 0.10;
                break;
            case VENTI:
                cost += 0.15;
                break;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }
}

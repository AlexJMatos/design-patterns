package strategy.impl;

import strategy.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Not able to fly...");
    }
}

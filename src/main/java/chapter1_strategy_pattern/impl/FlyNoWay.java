package chapter1_strategy_pattern.impl;

import chapter1_strategy_pattern.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Not able to fly...");
    }
}

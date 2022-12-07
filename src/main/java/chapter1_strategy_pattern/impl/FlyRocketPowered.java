package chapter1_strategy_pattern.impl;

import chapter1_strategy_pattern.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}

package chapter1_strategy_pattern.impl;

import chapter1_strategy_pattern.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying using wings!");
    }
}

package strategy.impl;

import strategy.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying using wings!");
    }
}

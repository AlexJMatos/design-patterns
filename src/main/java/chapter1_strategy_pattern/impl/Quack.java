package chapter1_strategy_pattern.impl;

import chapter1_strategy_pattern.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}

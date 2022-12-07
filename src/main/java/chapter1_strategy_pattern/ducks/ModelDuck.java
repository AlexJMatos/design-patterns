package chapter1_strategy_pattern.ducks;

import chapter1_strategy_pattern.impl.FlyNoWay;
import chapter1_strategy_pattern.impl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}

package chapter1_strategy_pattern.ducks;

import chapter1_strategy_pattern.impl.FlyNoWay;
import chapter1_strategy_pattern.impl.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    void display() {
        System.out.println("I am a Rubber Duck!");
    }
}

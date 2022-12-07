package chapter1_strategy_pattern.ducks;

import chapter1_strategy_pattern.impl.FlyWithWings;
import chapter1_strategy_pattern.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck!");
    }
}

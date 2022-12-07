package chapter1_strategy_pattern.ducks;

import chapter1_strategy_pattern.impl.FlyWithWings;
import chapter1_strategy_pattern.impl.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Red Head Duck!");
    }
}

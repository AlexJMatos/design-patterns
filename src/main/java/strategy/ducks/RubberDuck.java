package strategy.ducks;

import strategy.impl.FlyNoWay;
import strategy.impl.Squeak;

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

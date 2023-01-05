package strategy.ducks;

import strategy.impl.FlyWithWings;
import strategy.impl.Quack;

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

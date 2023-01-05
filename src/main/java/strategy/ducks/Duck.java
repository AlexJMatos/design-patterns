package strategy.ducks;

import strategy.FlyBehavior;
import strategy.QuackBehavior;

/**
 * Design Principle
 * Identify the aspects of your
 * application that vary and separate
 * them from what stays the same.
 * <p>
 * Design Principle
 * Program to an interface, not an
 * implementation.
 * <p>
 * Design Principle
 * Favor composition over inheritance.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    //------------------------------------//

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

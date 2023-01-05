package strategy;

import strategy.ducks.Duck;
import strategy.ducks.MallardDuck;
import strategy.ducks.ModelDuck;
import strategy.ducks.RubberDuck;
import strategy.impl.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck rubber = new RubberDuck();
        rubber.performQuack();
        rubber.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

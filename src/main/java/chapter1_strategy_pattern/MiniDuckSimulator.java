package chapter1_strategy_pattern;

import chapter1_strategy_pattern.ducks.Duck;
import chapter1_strategy_pattern.ducks.MallardDuck;
import chapter1_strategy_pattern.ducks.ModelDuck;
import chapter1_strategy_pattern.ducks.RubberDuck;
import chapter1_strategy_pattern.impl.FlyRocketPowered;

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

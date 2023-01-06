package decorator;

import decorator.beverage.Beverage;
import decorator.beverage.DarkRoast;
import decorator.beverage.Espresso;
import decorator.beverage.HouseBlend;
import decorator.condiment.Mocha;
import decorator.condiment.Soy;
import decorator.condiment.Whip;

import static decorator.beverage.Beverage.Size;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(Size.VENTI);
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2.setSize(Size.TALL);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3.setSize(Size.GRANDE);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}

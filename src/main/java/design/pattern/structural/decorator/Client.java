package design.pattern.structural.decorator;

import design.pattern.structural.decorator.beverage.Beverage;
import design.pattern.structural.decorator.beverage.impl.DarkRoast;
import design.pattern.structural.decorator.beverage.impl.HouseBlend;
import design.pattern.structural.decorator.addon.impl.Milk;
import design.pattern.structural.decorator.addon.impl.Mocha;

public class Client {

    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage.getDesc();
        System.out.println("Cost: " + beverage.getCost());

        // Adding Mocha
        beverage = new Mocha(beverage);
        beverage.getDesc();
        System.out.println("Cost: " + beverage.getCost());

        // Adding Milk
        beverage = new Milk(beverage);
        beverage.getDesc();
        System.out.println("Cost: " + beverage.getCost());

        // Adding Dark Roast
        Beverage darkRoast = new DarkRoast();
        darkRoast.getDesc();
        System.out.println("Cost: " + darkRoast.getCost());
    }
}

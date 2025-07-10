package design.pattern.structural.decorator.beverage.impl;

import design.pattern.structural.decorator.beverage.Beverage;

public class DarkRoast implements Beverage {

    @Override
    public void getDesc() {
        System.out.println("Dark Roast");
    }

    @Override
    public int getCost() {
        return 20;
    }
}

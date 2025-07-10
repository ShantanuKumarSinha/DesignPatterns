package design.pattern.structural.decorator.beverage.impl;

import design.pattern.structural.decorator.beverage.Beverage;

public class HouseBlend implements Beverage {

    @Override
    public void getDesc() {
        System.out.println("House Blend Coffee");
    }

    @Override
    public int getCost() {
        return 15;
    }
}

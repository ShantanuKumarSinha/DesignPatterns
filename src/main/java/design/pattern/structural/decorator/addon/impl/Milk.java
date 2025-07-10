package design.pattern.structural.decorator.addon.impl;

import design.pattern.structural.decorator.addon.AddOn;
import design.pattern.structural.decorator.beverage.Beverage;

public class Milk extends AddOn {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void getDesc() {
        this.b.getDesc();
        System.out.println("Milk");
    }

    @Override
    public int getCost() {
        return this.b.getCost() + 2;
    }
}

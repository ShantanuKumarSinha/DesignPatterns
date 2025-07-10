package design.pattern.structural.decorator.addon.impl;

import design.pattern.structural.decorator.addon.AddOn;
import design.pattern.structural.decorator.beverage.Beverage;

public class Mocha extends AddOn {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void getDesc() {
        this.b.getDesc();
        System.out.println("Mocha");
    }

    @Override
    public int getCost() {
        return this.b.getCost() + 20;
    }
}

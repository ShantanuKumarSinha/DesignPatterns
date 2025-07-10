package design.pattern.structural.decorator.addon;

import design.pattern.structural.decorator.beverage.Beverage;

public abstract class AddOn implements Beverage {

    protected Beverage b;

    protected AddOn(Beverage b) {
        this.b = b;
    }

}

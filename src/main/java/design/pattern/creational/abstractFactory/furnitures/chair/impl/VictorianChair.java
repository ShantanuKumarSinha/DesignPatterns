package design.pattern.creational.abstractFactory.furnitures.chair.impl;

import design.pattern.creational.abstractFactory.furnitures.chair.Chair;

public class VictorianChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("Victorian Chair: Sitting on an ornate and elegant Victorian chair.");
    }
}

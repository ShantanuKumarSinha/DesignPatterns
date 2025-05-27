package design.pattern.creational.abstractFactory.furnitures.chair.impl;

import design.pattern.creational.abstractFactory.furnitures.chair.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Modern Chair: Sitting on a sleek and stylish modern chair.");
    }
}

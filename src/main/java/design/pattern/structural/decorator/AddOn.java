package design.pattern.structural.decorator;

public abstract class AddOn implements Beverage {
    Beverage b;

    AddOn(Beverage b) {
        this.b = b;
    }

}

package design.pattern.structural.decorator;

public class DarkRoast implements  Beverage {

    @Override
    public void getDesc() {
        System.out.println("Dark Roast");
    }

    @Override
    public int getCost() {
        return 20;
    }
}

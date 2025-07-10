package design.pattern.structural.decorator;

public class Milk extends AddOn{
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

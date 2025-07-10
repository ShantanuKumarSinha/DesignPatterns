package design.pattern.structural.decorator;

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

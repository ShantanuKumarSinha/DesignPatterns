package design.pattern.structural.adapter.PegAdapter;

public class RoundHole {

    private double radius;

    public RoundHole(int radius) {
        this.radius = this.radius;
    }

    public double getRadius(int size) {
        return radius * size;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.radius >= peg.getRadius());
        return result;
    }

}

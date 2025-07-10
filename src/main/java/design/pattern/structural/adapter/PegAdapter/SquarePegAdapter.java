package design.pattern.structural.adapter.PegAdapter;

public class SquarePegAdapter extends  RoundPeg {


    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    public double getRadius(int size) {
        double result = 0;
        result = Math.sqrt(size*size+size*size)/2;
        return result;
    }

}

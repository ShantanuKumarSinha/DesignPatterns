package design.pattern.behavioural.strategy;

public class Client {

    public static void main(String[] args) {
        GoogleMap googleMap = new GoogleMap();
        googleMap.findPathByMode(TravelMode.BUS);
    }
}

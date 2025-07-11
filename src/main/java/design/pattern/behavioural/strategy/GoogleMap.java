package design.pattern.behavioural.strategy;

public class GoogleMap {


    public void findPathByMode(TravelMode travelMode) {
        System.out.println("Finding path by Travel Mode " + travelMode);
        var pathCalculationStrategy = PathCalculationStrategyFactory.getPathCalculationStrategy(travelMode);
        pathCalculationStrategy.calculatePath(travelMode);
    }

}

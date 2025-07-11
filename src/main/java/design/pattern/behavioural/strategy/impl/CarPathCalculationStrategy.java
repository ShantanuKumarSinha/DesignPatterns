package design.pattern.behavioural.strategy.impl;

import design.pattern.behavioural.strategy.PathCalculationStrategy;
import design.pattern.behavioural.strategy.TravelMode;

public class CarPathCalculationStrategy implements PathCalculationStrategy {
    @Override
    public void calculatePath(TravelMode travelMode) {
        System.out.println("Car Path Calculation Strategy");
    }
}

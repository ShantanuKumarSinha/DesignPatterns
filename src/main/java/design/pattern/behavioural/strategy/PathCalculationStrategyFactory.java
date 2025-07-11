package design.pattern.behavioural.strategy;

import design.pattern.behavioural.strategy.impl.BikePathCalculationStrategy;
import design.pattern.behavioural.strategy.impl.BusPathCalculationStrategy;
import design.pattern.behavioural.strategy.impl.CarPathCalculationStrategy;
import design.pattern.behavioural.strategy.impl.WalkingPathCalculationStrategy;

public class PathCalculationStrategyFactory {

    /**
     * Returns the appropriate path calculation strategy based on the travel mode.
     *
     * @param travelMode the mode of travel
     * @return the path calculation strategy
     */
    public static PathCalculationStrategy getPathCalculationStrategy(TravelMode travelMode) {
        switch (travelMode) {
            case WALKING:
                return new WalkingPathCalculationStrategy();
            case BIKE:
                return new BikePathCalculationStrategy();
            case CAR:
                return new CarPathCalculationStrategy();
            case BUS:
                return new BusPathCalculationStrategy();
            default:
                throw new IllegalArgumentException("Unsupported travel mode: " + travelMode);
        }
    }
}

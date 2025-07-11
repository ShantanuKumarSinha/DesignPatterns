package design.pattern.behavioural.strategy;

public interface PathCalculationStrategy {
    /**
     * Calculates the path based on the travel mode.
     *
     * @param travelMode the mode of travel
     */
    void calculatePath(TravelMode travelMode);
}

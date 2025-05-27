package design.pattern.creational.factory.animals;

import design.pattern.creational.factory.enums.FoodType;

public interface Animal {
    /**
     * Makes a sound specific to the animal type.
     *
     * @return the sound made by the animal
     */
    String makeSound();

    /**
     * Returns the food type of the animal.
     *
     * @return the food type of the animal
     */
    FoodType getFoodType();
}

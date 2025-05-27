package design.pattern.creational.factory.impl;

import design.pattern.creational.factory.animals.Animal;
import design.pattern.creational.factory.AnimalFactory;
import design.pattern.creational.factory.animals.impl.Bear;
import design.pattern.creational.factory.animals.impl.Cow;
import design.pattern.creational.factory.animals.impl.Dog;
import design.pattern.creational.factory.enums.FoodType;

public class AnimalFactoryImpl implements AnimalFactory {

    @Override
    public Animal createAnimal(FoodType foodType) {
        switch (foodType) {
            case FoodType.CARNIVORE -> {
                return new Dog();
            }
            case FoodType.HERBIVORE -> {
                return new Cow();
            }
            case FoodType.OMNIVORE -> {
                return new Bear();
            }
            default -> {
                throw new IllegalArgumentException("Unknown food type: " + foodType);
            }
        }
    }
}

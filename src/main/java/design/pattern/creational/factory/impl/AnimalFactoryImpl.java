package design.pattern.creational.factory.impl;

import design.pattern.creational.factory.Animal;
import design.pattern.creational.factory.AnimalFactory;
import design.pattern.creational.factory.animals.Bear;
import design.pattern.creational.factory.animals.Cow;
import design.pattern.creational.factory.animals.Dog;

public class AnimalFactoryImpl implements AnimalFactory {

  @Override
  public Animal createAnimal(String animalType) {
    switch (animalType.toUpperCase()) {
      case "DOG" -> {
        return new Dog();
      }
      case "COW" -> {
        return new Cow();
      }
      case "BEAR" -> {
        return new Bear();
      }
      default -> {
        throw new IllegalArgumentException("Unknown animal type: " + animalType);
      }
    }
  }
}

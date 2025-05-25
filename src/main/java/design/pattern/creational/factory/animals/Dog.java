package design.pattern.creational.factory.animals;

import design.pattern.creational.factory.Animal;
import design.pattern.creational.factory.enums.FoodType;

public class Dog implements Animal {
  @Override
  public String makeSound() {
    return "Bark";
  }

  @Override
  public FoodType getFoodType() {
    return FoodType.CARNIVORE;
  }
}

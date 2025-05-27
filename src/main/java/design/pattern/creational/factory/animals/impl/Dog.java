package design.pattern.creational.factory.animals.impl;

import design.pattern.creational.factory.animals.Animal;
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

package design.pattern.creational.factory.animals.impl;

import design.pattern.creational.factory.animals.Animal;
import design.pattern.creational.factory.enums.FoodType;

public class Bear implements Animal {
  @Override
  public String makeSound() {
    return "Roar";
  }

  @Override
  public FoodType getFoodType() {
    return FoodType.OMNIVORE;
  }
}

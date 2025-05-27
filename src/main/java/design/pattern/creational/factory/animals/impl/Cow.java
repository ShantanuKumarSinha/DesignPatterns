package design.pattern.creational.factory.animals.impl;

import design.pattern.creational.factory.animals.Animal;
import design.pattern.creational.factory.enums.FoodType;

public class Cow implements Animal {
  @Override
  public String makeSound() {
    return "Moo";
  }

  @Override
  public FoodType getFoodType() {
    return FoodType.HERBIVORE;
  }
}

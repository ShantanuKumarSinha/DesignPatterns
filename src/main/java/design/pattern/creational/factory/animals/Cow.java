package design.pattern.creational.factory.animals;

import design.pattern.creational.factory.Animal;
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

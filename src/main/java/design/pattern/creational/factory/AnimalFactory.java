package design.pattern.creational.factory;

import design.pattern.creational.factory.animals.Animal;
import design.pattern.creational.factory.enums.FoodType;

public interface AnimalFactory {

  /**
   * Creates an animal of the specified type.
   *
   * @param foodType the type of animal to create
   * @return an instance of the specified animal type
   */
  Animal createAnimal(FoodType foodType);
}

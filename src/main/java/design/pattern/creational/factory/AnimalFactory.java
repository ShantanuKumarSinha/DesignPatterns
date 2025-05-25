package design.pattern.creational.factory;

public interface AnimalFactory {

  /**
   * Creates an animal of the specified type.
   *
   * @param animalType the type of animal to create
   * @return an instance of the specified animal type
   */
  Animal createAnimal(String animalType);
}

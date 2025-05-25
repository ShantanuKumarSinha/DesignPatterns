package design.pattern.creational.factory;

import design.pattern.creational.factory.impl.AnimalFactoryImpl;

public class Client {
  public static void main(String[] args) {
    AnimalFactory animalFactory = new AnimalFactoryImpl();

    Animal dog = animalFactory.createAnimal("Dog");
    System.out.println("Dog sound: " + dog.makeSound());
    System.out.println("Dog food type: " + dog.getFoodType());

    Animal cow = animalFactory.createAnimal("Cow");
    System.out.println("Cow sound: " + cow.makeSound());
    System.out.println("Cow food type: " + cow.getFoodType());

    Animal bear = animalFactory.createAnimal("Bear");
    System.out.println("Bear sound: " + bear.makeSound());
    System.out.println("Bear food type: " + bear.getFoodType());
  }
}

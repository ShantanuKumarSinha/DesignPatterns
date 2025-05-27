package design.pattern.creational.factory;

import design.pattern.creational.factory.animals.Animal;
import design.pattern.creational.factory.enums.FoodType;
import design.pattern.creational.factory.impl.AnimalFactoryImpl;

public class Client {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactoryImpl();
        Animal dog = animalFactory.createAnimal(FoodType.CARNIVORE);
        System.out.println("Dog sound: " + dog.makeSound());
        System.out.println("Dog food type: " + dog.getFoodType());

        Animal cow = animalFactory.createAnimal(FoodType.HERBIVORE);
        System.out.println("Cow sound: " + cow.makeSound());
        System.out.println("Cow food type: " + cow.getFoodType());

        Animal bear = animalFactory.createAnimal(FoodType.OMNIVORE);
        System.out.println("Bear sound: " + bear.makeSound());
        System.out.println("Bear food type: " + bear.getFoodType());
    }
}

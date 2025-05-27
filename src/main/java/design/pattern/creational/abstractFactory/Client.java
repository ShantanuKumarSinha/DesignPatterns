package design.pattern.creational.abstractFactory;

import design.pattern.creational.abstractFactory.furnitureFactory.FurnitureFactory;
import design.pattern.creational.abstractFactory.furnitureFactory.enums.FurnitureStyle;
import design.pattern.creational.abstractFactory.furnitureFactory.impl.ModernFurnitureFactory;
import design.pattern.creational.abstractFactory.furnitureFactory.impl.VictorianFurnitureFactory;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose Furniture Style");
        System.out.println("1 for Modern and 2 For Victorian Style");
        System.out.print("Enter your choice: ");
        var furnitureStyleInput = scanner.nextInt();
        var furnitureFactory = getFurnitureFactory(furnitureStyleInput);
        System.out.println("You have selected " + furnitureFactory.getClass().getSimpleName() + " Factory");
        // Use the factory to create furniture
        var chair = furnitureFactory.createChair();
        chair.sitOn();
        // Use the factory to create furniture
        var table = furnitureFactory.createTable();
        table.useTable();

        // Client code can use the factories to create furniture
//        FurnitureFactory modernFactory = new ModernFurnitureFactory();
//
//        Chair modernChair = modernFactory.createChair();
//        modernChair.sitOn();
//        Table modernTable = modernFactory.createTable();
//        modernTable.useTable();
//
//        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
//
//        Chair victorianChair = victorianFactory.createChair();
//        victorianChair.sitOn();
//        Table victorianTable = victorianFactory.createTable();
//        victorianTable.useTable();
    }

    private static FurnitureFactory getFurnitureFactory(int furnitureStyleInput) {
        var furnitureStyle = furnitureStyleInput - 1 == FurnitureStyle.MODERN.ordinal() ? FurnitureStyle.MODERN : FurnitureStyle.VCTORIAN;
        switch (furnitureStyle) {
            case MODERN -> {
                return new ModernFurnitureFactory();
            }
            case VCTORIAN -> {
                return new VictorianFurnitureFactory();
            }
            default -> {
                throw new IllegalArgumentException("Invalid Furniture Style");
            }

        }
    }

}

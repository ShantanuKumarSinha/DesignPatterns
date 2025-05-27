package design.pattern.creational.abstractFactory.furnitureFactory.impl;

import design.pattern.creational.abstractFactory.furnitures.chair.Chair;
import design.pattern.creational.abstractFactory.furnitures.chair.impl.VictorianChair;
import design.pattern.creational.abstractFactory.furnitureFactory.FurnitureFactory;
import design.pattern.creational.abstractFactory.furnitures.table.Table;
import design.pattern.creational.abstractFactory.furnitures.table.impl.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}

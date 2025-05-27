package design.pattern.creational.abstractFactory.furnitureFactory.impl;

import design.pattern.creational.abstractFactory.furnitures.chair.Chair;
import design.pattern.creational.abstractFactory.furnitures.chair.impl.ModernChair;
import design.pattern.creational.abstractFactory.furnitureFactory.FurnitureFactory;
import design.pattern.creational.abstractFactory.furnitures.table.Table;
import design.pattern.creational.abstractFactory.furnitures.table.impl.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}

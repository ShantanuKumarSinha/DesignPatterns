package design.pattern.creational.abstractFactory.furnitureFactory;

import design.pattern.creational.abstractFactory.furnitures.chair.Chair;
import design.pattern.creational.abstractFactory.furnitures.table.Table;

public interface FurnitureFactory {

    /**
     * Creates a chair of the specified type.
     *
     * @return an instance of the specified chair type
     */
    Chair createChair();

    /**
     * Creates a table of the specified type.
     * @return an instance of the specified table type
     */
    Table createTable();
}

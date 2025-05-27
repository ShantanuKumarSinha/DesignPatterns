package design.pattern.creational.abstractFactory.furnitures.table.impl;

import design.pattern.creational.abstractFactory.furnitures.table.Table;

public class ModernTable implements Table {
    @Override
    public void useTable() {
        System.out.println("Modern Table: Using a sleek and stylish modern table.");
    }
}

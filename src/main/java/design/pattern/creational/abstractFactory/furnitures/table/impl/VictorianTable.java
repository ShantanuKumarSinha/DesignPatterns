package design.pattern.creational.abstractFactory.furnitures.table.impl;

import design.pattern.creational.abstractFactory.furnitures.table.Table;

public class VictorianTable implements Table {
    @Override
    public void useTable() {
        System.out.println("Victorian Table: Using an ornate and elegant Victorian table.");
    }
}

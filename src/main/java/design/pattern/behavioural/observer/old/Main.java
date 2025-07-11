package design.pattern.behavioural.observer.old;


import design.pattern.behavioural.observer.old.observable.Stock;
import design.pattern.behavioural.observer.old.observer.PriceObserver;

public class Main {
  public static void main(String[] args) {
    Stock googleStock = new Stock(100, 10, "GOOG");

    PriceObserver priceObserver = new PriceObserver("Observer");

    googleStock.addObserver(priceObserver);

    googleStock.setPrice(101.0);
    googleStock.setPrice(108.0);
  }
}

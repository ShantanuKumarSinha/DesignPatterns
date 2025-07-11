package design.pattern.behavioural.observer.old.observer;

import design.pattern.behavioural.observer.old.observable.Stock;

import java.util.Observable;
import java.util.Observer;

public class PriceObserver implements Observer {
  private String name;

  public PriceObserver(String name) {
    this.name = name;
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof Stock) {
      Stock stock = (Stock) o;
      System.out.println("Price of " + stock.getSymbol() + " is " + stock.getPrice() + " now");
    }
  }
}

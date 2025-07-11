package design.pattern.behavioural.observer.old.observable;

import java.util.Observable;

public class Stock extends Observable {
  private double price;
  private double volume;
  private String symbol;

  public Stock(double price, double volume, String symbol) {
    this.price = price;
    this.volume = volume;
    this.symbol = symbol;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (this.price != price) {
      this.price = price;
      setChanged();
      notifyObservers();
    }
  }

  public String getSymbol() {
    return symbol;
  }

}

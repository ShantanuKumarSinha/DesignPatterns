package design.pattern.behavioural.observer.current;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.*;

public class StockPublisher implements Publisher<Double> {
    private List<Subscriber<? super Double>> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber<? super Double> subscriber) {
        subscribers.add(subscriber);
        subscriber.onSubscribe(new StockSubscription(subscriber, this));
    }

    public void setPrice(double price) {
        for (Subscriber<? super Double> subscriber : subscribers) {
            subscriber.onNext(price);
        }
    }

    public void removeSubscriber(Subscriber<? super Double> subscriber) {
        subscribers.remove(subscriber);
        subscriber.onComplete();
    }
}

class StockSubscription implements Subscription {
    private final Subscriber<? super Double> subscriber;
    private final StockPublisher publisher;

    public StockSubscription(Subscriber<? super Double> subscriber, StockPublisher publisher) {
        this.subscriber = subscriber;
        this.publisher = publisher;
    }

    @Override
    public void request(long n) {
        // request logic (could be no-op in this simple example)
    }

    @Override
    public void cancel() {
        publisher.removeSubscriber(subscriber);
    }
}

class PriceSubscriber implements Subscriber<Double> {
    @Override
    public void onSubscribe(Subscription subscription) {
        subscription.request(Long.MAX_VALUE); // request all data
    }

    @Override
    public void onNext(Double price) {
        System.out.println("New stock price: " + price);
    }

    @Override
    public void onError(Throwable throwable) {
        System.err.println("Error: " + throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("No more stock price updates.");
    }
}


package design.pattern.structural.adapter.tightCoupling;

public class Client {
    public static void main(String[] args) {
        PhonePe ph = new PhonePe();
        ph.checkLoanEligibility();
    }
}

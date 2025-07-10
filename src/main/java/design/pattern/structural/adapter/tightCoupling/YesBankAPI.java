package design.pattern.structural.adapter.tightCoupling;

public class YesBankAPI {
    public int getBalance(){
        return 100;
    }

    public void moneyTransfer(){
        System.out.println("Money is transferred via Yes Bank!");
    }
}

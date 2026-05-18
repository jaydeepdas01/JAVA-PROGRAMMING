interface Payment {
    void pay(int amount);
}

class CreditCard implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println(amount + "rs Pay by credit card.");
    }
}

class UPI implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println(amount + "rs pay by upi.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment p;
        p = new CreditCard();
        p.pay(1000);

        p = new UPI();
        p.pay(2000);
    }
}

package truu_tuong;

public abstract class PaymentGateway {
    public abstract void processPayment (double amount);
}

class PayPalPayment extends PaymentGateway{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class MomoPayment extends   PaymentGateway{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing Momo payment of " + amount + "vnd");
    }
}
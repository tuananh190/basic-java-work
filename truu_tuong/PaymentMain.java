package truu_tuong;

public class PaymentMain {
    public static void main (String[]args) {
        PaymentGateway gateway1 = new PayPalPayment();
        gateway1.processPayment(100.0);

        PaymentGateway gateway2 = new MomoPayment();
        gateway2.processPayment(500_000);
    }
}

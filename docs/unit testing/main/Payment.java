package TRIP;

public class Payment {

    private int paymentId;
    private double amount;

    public Payment(int paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isValidPayment() {
        return amount > 0;
    }
}

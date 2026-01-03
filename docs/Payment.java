package TRIP;

/**
 * @author Hp
 * @version 1.0
 * @created 29-Dec-2025 9:30:21 PM
 */
public class Payment {

	private int amount;
	private int paymentId;
	private char paymentMethod;
	private char status;
	private int transactionId;

	public Payment() {
	}

	public Payment(int id, int amt) {
		paymentId = id;
		amount = amt;
		status = 'P';
	}

	public void processPayment() {
		status = 'C';
		transactionId = 1000 + paymentId;
	}

	public void refund() {
		status = 'R';
	}

	public int getPaymentId() {
		return paymentId;
	}

	public int getAmount() {
		return amount;
	}

	public char getStatus() {
		return status;
	}

	public void setAmount(int amt) {
		amount = amt;
	}

	public void setPaymentMethod(char method) {
		paymentMethod = method;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}
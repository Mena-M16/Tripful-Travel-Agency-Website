package TRIP;

public class Confirmation {

    private int confirmationId;
    private boolean confirmed;

    public Confirmation(int confirmationId, boolean confirmed) {
        this.confirmationId = confirmationId;
        this.confirmed = confirmed;
    }

    public int getConfirmationId() {
        return confirmationId;
    }

    public boolean isConfirmed() {
        return confirmed;
    }
}

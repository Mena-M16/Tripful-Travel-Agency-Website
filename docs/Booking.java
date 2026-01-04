public class Booking {
    private int bookingId;
    private TravelPackage travelPackage;
    private boolean confirmed = false;

    public Booking(int bookingId, TravelPackage travelPackage) {
        this.bookingId = bookingId;
        this.travelPackage = travelPackage;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void confirmBooking() {
        confirmed = true;
        System.out.println("Booking #" + bookingId + " confirmed for package: " + travelPackage.getName());
    }

    public boolean isConfirmed() {
        return confirmed;
    }
}

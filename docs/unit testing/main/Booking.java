package TRIP;

public class Booking {

    private int bookingId;
    private TravelPackage travelPackage;

    public Booking(int bookingId, TravelPackage travelPackage) {
        this.bookingId = bookingId;
        this.travelPackage = travelPackage;
    }

    public int getBookingId() {
        return bookingId;
    }

    public TravelPackage getTravelPackage() {
        return travelPackage;
    }
}

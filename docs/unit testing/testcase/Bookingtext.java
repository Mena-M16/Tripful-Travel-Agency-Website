package TRIP;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookingTest {

    private Booking booking;
    private TravelPackage travelPackage;

    @BeforeEach
    void setUp() {
        travelPackage = new TravelPackage("Axum", 1200);
        booking = new Booking(10, travelPackage);
    }

    @Test
    void testBookingId() {
        assertEquals(10, booking.getBookingId());
    }

    @Test
    void testTravelPackageNotNull() {
        assertNotNull(booking.getTravelPackage());
    }

    @Test
    void testBookingDestination() {
        assertEquals("Axum", booking.getTravelPackage().getDestination());
    }
}

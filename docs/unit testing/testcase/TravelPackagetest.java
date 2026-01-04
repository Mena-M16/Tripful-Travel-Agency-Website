package TRIP;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TravelPackageTest {

    private TravelPackage travelPackage;

    @BeforeEach
    void setUp() {
        travelPackage = new TravelPackage("Lalibela", 1500.00);
    }

    @Test
    void testDestination() {
        assertEquals("Lalibela", travelPackage.getDestination());
    }

    @Test
    void testPrice() {
        assertEquals(1500.00, travelPackage.getPrice());
    }
}

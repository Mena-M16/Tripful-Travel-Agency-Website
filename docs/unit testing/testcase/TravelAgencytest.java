package TRIP;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TravelAgencyTest {

    private TravelAgency agency;

    @BeforeEach
    void setUp() {
        agency = new TravelAgency("Tripful Travel Agency");
    }

    @Test
    void testAgencyName() {
        assertEquals("Tripful Travel Agency", agency.getAgencyName());
    }

    @Test
    void testValidAgency() {
        assertTrue(agency.isValidAgency());
    }
}

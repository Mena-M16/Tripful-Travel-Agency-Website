package TRIP;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StaffTest {

    private Staff staff;

    @BeforeEach
    void setUp() {
        staff = new Staff(10, "Abel");
    }

    @Test
    void testStaffId() {
        assertEquals(10, staff.getStaffId());
    }

    @Test
    void testStaffName() {
        assertEquals("Abel", staff.getName());
    }
}

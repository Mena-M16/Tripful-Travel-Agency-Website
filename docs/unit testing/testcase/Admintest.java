package TRIP;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdminTest {

    private Admin admin;

    // Runs before each test (Readable & Structured)
    @BeforeEach
    void setUp() {
        admin = new Admin(101, 'A');
    }

    // Automated Test Execution
    @Test
    void testAdminId() {
        assertEquals(101, admin.getAdminId());
    }

    // Assertion validation
    @Test
    void testAdminRole() {
        assertEquals('A', admin.getRole());
    }

    // TDD-style behavior test
    @Test
    void testCanViewReport() {
        assertTrue(admin.canViewReport());
    }
}

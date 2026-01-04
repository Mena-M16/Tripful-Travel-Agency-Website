package TRIP;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConfirmationTest {

    private Confirmation confirmation;

    @BeforeEach
    void setUp() {
        confirmation = new Confirmation(301, true);
    }

    @Test
    void testConfirmationId() {
        assertEquals(301, confirmation.getConfirmationId());
    }

    @Test
    void testConfirmationStatus() {
        assertTrue(confirmation.isConfirmed());
    }
}

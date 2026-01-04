package TRIP;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaymentTest {

    private Payment payment;

    @BeforeEach
    void setUp() {
        payment = new Payment(200, 2500.00);
    }

    @Test
    void testPaymentId() {
        assertEquals(200, payment.getPaymentId());
    }

    @Test
    void testPaymentAmount() {
        assertEquals(2500.00, payment.getAmount());
    }

    @Test
    void testValidPayment() {
        assertTrue(payment.isValidPayment());
    }
}

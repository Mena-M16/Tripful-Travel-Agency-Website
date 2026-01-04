package TRIP;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReviewTest {

    private Review review;

    @BeforeEach
    void setUp() {
        review = new Review(5, "Excellent service");
    }

    @Test
    void testRating() {
        assertEquals(5, review.getRating());
    }

    @Test
    void testPositiveReview() {
        assertTrue(review.isPositiveReview());
    }
}

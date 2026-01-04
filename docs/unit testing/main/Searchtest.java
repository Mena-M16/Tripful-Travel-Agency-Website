package TRIP;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class SearchTest {

    @Test
    void testSearchDestination() {
        Search search = new Search();
        List<String> results = search.searchDestination("Ethiopia");

        assertNotNull(results);
        assertEquals(2, results.size());
        assertTrue(results.contains("Lalibela"));
    }
}

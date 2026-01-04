package TRIP;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<String> searchDestination(String keyword) {
        List<String> results = new ArrayList<>();

        if ("Ethiopia".equalsIgnoreCase(keyword)) {
            results.add("Lalibela");
            results.add("Axum");
        }
        return results;
    }
}

package TRIP;

public class Review {

    private int rating;
    private String comment;

    public Review(int rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public boolean isPositiveReview() {
        return rating >= 4;
    }
}

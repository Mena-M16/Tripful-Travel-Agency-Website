package TRIP;

public class TravelPackage {

    private String destination;
    private double price;

    public TravelPackage(String destination, double price) {
        this.destination = destination;
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public double getPrice() {
        return price;
    }
}

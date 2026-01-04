package TRIP;

public class TravelAgency {

    private String agencyName;

    public TravelAgency(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public boolean isValidAgency() {
        return agencyName != null && !agencyName.isEmpty();
    }
}


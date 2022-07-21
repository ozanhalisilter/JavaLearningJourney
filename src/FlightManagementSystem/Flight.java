package FlightManagementSystem;

public class Flight {
    private String seferNumber;
    private Airport takeOffAirport;
    private Airport landingAirport;
    private String takeOffTime;
    private String landingTime;
    private Pilot pilot;
    private Pilot coPilot;

    private Company company;

    public Flight(String seferNumber, Airport takeOffAirport, Airport landingAirport, String takeOffTime, String landingTime, Pilot pilot, Pilot coPilot) {
        this.seferNumber = seferNumber;
        this.takeOffAirport = takeOffAirport;
        this.landingAirport = landingAirport;
        this.takeOffTime = takeOffTime;
        this.landingTime = landingTime;
        this.pilot = pilot;
        this.coPilot = coPilot;
    }


}

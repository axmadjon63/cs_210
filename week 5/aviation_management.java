class BoardingPass {
    private String seatNumber;
    private String gate;
    
    public BoardingPass(String seatNumber, String gate) {
        this.seatNumber = seatNumber;
        this.gate = gate;
    }
    
    public String toString() {
        return "Seat: " + seatNumber + ", Gate: " + gate;
    }
}
class Flight {
    private String flightID;
    private String destination;
    private BoardingPass boardingPass;

    public Flight(String flightID, String destination, String seatNumber, String gate) {
        this.flightID = flightID;
        this.destination = destination;
        this.boardingPass = new BoardingPass(seatNumber, gate);
    }

    public String toString() {
        return "Flight: " + flightID + ", Destination: " + destination + ", " + boardingPass.toString();
    }
}
public class aviation_management {
    public static void main(String[] args){
        Flight flight = new Flight("A123", "New York", "B1", "13");
        System.out.println("New flight: " + flight.toString());
        flight = null;
        System.out.println("The Flight object deleted");
        System.out.println("No way to access the Boarding Pass of the flight since the reference is gone with the Flight object.");
    }
}

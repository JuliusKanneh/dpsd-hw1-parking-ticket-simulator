package parkingTicketSimulator;

public class TestParkingTicket
{
    public static void main(String args[])
    {
        ParkedCar parkedCar = new ParkedCar("Toyota", "Camry", "red", "RAB 123 A", 122);
        ParkingMeter parkingMeter = new ParkingMeter(60);
        PoliceOfficer policeOfficer = new PoliceOfficer("John Brown", "RP12345");
        
        if(parkingMeter.isPurchasedTimeExpired(parkedCar)) {
            ParkingTicket parkingTicket = policeOfficer.issueTicket(parkedCar, parkingMeter);
            System.out.println(parkingTicket);
        }
        
    }
}

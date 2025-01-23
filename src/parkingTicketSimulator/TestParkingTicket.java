package parkingTicketSimulator;

public class TestParkingTicket
{
    public static void main(String args[])
    {
        //--------Test Case 1-----------------
//        ParkedCar parkedCar = new ParkedCar("Toyota", "Camry", "red", "RAB 123 A", 50);
//        ParkingMeter parkingMeter = new ParkingMeter(60);
//        PoliceOfficer policeOfficer = new PoliceOfficer("John Brown", "RP12345");
        
      //--------Test Case 2-----------------
//        ParkedCar parkedCar = new ParkedCar("Toyota", "Camry", "red", "RAB 123 A", 120);
//        ParkingMeter parkingMeter = new ParkingMeter(60);
//        PoliceOfficer policeOfficer = new PoliceOfficer("John Brown", "RP12345");
        
      //--------Test Case 3-----------------
//        ParkedCar parkedCar = new ParkedCar("Toyota", "Camry", "red", "RAB 123 A", 5);
//        ParkingMeter parkingMeter = new ParkingMeter(60);
//        PoliceOfficer policeOfficer = new PoliceOfficer("John Brown", "RP12345");
        
      //--------Test Case 4-----------------
//        ParkedCar parkedCar = new ParkedCar("Toyota", "Camry", "red", "RAB 123 A", 61);
//        ParkingMeter parkingMeter = new ParkingMeter(60);
//        PoliceOfficer policeOfficer = new PoliceOfficer("John Brown", "RP12345");
        
      //--------Test Case 5-----------------
//        ParkedCar parkedCar = new ParkedCar("Toyota", "Camry", "red", "RAB 123 A", 60);
//        ParkingMeter parkingMeter = new ParkingMeter(60);
//        PoliceOfficer policeOfficer = new PoliceOfficer("John Brown", "RP12345");
        
      //--------Test Case 6-----------------
//        ParkedCar parkedCar = new ParkedCar("Toyota", "Camry", "red", "RAB 123 A", 79);
//        ParkingMeter parkingMeter = new ParkingMeter(60);
//        PoliceOfficer policeOfficer = new PoliceOfficer("John Brown", "RP12345");
        
      //--------Test Case 7-----------------
//        ParkedCar parkedCar = new ParkedCar("Toyota", "Camry", "red", "RAB 123 A", 130);
//        ParkingMeter parkingMeter = new ParkingMeter(60);
//        PoliceOfficer policeOfficer = new PoliceOfficer("John Brown", "RP12345");
        
      //--------Test Case 8-----------------
//        ParkedCar parkedCar = new ParkedCar("Toyota", "Camry", "red", "RAB 123 A", 120);
//        ParkingMeter parkingMeter = new ParkingMeter(60);
//        PoliceOfficer policeOfficer = new PoliceOfficer("John Brown", "RP12345");
        
      //--------Test Case 9-----------------
        ParkedCar parkedCar = new ParkedCar("Toyota", "Camry", "red", "RAB 123 A", 222);
        ParkingMeter parkingMeter = new ParkingMeter(60);
        PoliceOfficer policeOfficer = new PoliceOfficer("John Brown", "RP12345");
        
      //--------Test Case 10-----------------
//        ParkedCar parkedCar = new ParkedCar("Toyota", "Camry", "red", "RAB 123 A", 120);
//        ParkingMeter parkingMeter = new ParkingMeter(120);
//        PoliceOfficer policeOfficer = new PoliceOfficer("John Brown", "RP12345");
        
      //--------Test Case 10-----------------
//        ParkedCar parkedCar = new ParkedCar("Toyota", "Camry", "red", "RAB 123 A", 121);
//        ParkingMeter parkingMeter = new ParkingMeter(120);
//        PoliceOfficer policeOfficer = new PoliceOfficer("John Brown", "RP12345");
        
        if(parkingMeter.isPurchasedTimeExpired(parkedCar)) {
            ParkingTicket parkingTicket = policeOfficer.issueTicket(parkedCar, parkingMeter);
            System.out.println(parkingTicket);
        }
        else 
        {
            System.out.println("The parked car is within the parking time purchased.");
        }
        
    }
}

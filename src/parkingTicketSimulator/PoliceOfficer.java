package parkingTicketSimulator;

public class PoliceOfficer
{
    private String _name;
    private String _batchNumber;
    
    public PoliceOfficer(String name, String batchNumber)
    {
        super();
        _name = name;
        _batchNumber = batchNumber;
    }
    
    public PoliceOfficer(PoliceOfficer policeOfficer) {
        _name = policeOfficer.getName();
        _batchNumber = policeOfficer.getBatchNumber();
    }
    
    public String getName()
    {
        return _name;
    }
    public void setName(String name)
    {
        _name = name;
    }
    public String getBatchNumber()
    {
        return _batchNumber;
    }
    public void setBatchNumber(String batchNumber)
    {
        _batchNumber = batchNumber;
    }
    
    public void setNameAndBatchNumber(String name, String batchNumber) {
        _name = name;
        _batchNumber = batchNumber;
    }
    
    @Override
    public String toString()
    {
        return "PoliceOfficer [name=" + _name + ", batchNumber=" + _batchNumber + "]";
    }
    
    public boolean isParkedCarTimeExpired(ParkedCar parkedCar, ParkingMeter parkingMeter) 
    {
        if (parkedCar.getMinsParked() > parkingMeter.get_minutesPurchased()) 
            return true;
        
        return false;
    }
    
    public ParkingTicket issueTicket(ParkedCar parkedCar, ParkingMeter parkingMeter) 
    {
//        ParkingTicket parkingTicket = new ParkingTicket(parkedCar, this, parkingMeter);
//        double fine = parkingTicket.computeFine(parkingMeter);
//        parkingTicket.setFine(fine);
        return new ParkingTicket(parkedCar, this, parkingMeter);
    }
}

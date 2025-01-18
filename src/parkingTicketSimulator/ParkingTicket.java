package parkingTicketSimulator;

public class ParkingTicket
{
    private ParkedCar _parkedCar;
    private double _fine;
    private PoliceOfficer _policeOfficer;
    
    public ParkingTicket(ParkedCar parkedCar, PoliceOfficer policeOfficer)
    {
        super();
        _parkedCar = parkedCar;
        _policeOfficer = policeOfficer;
//        _fine = computeFine();
    }

    public ParkedCar getParkedCar()
    {
        return _parkedCar;
    }

    public void setParkedCar(ParkedCar parkedCar)
    {
        this._parkedCar = parkedCar;
    }

    public double getFine()
    {
        return _fine;
    }

    public void setFine(double fine)
    {
        _fine = fine;
    }

    public PoliceOfficer getPoliceOfficer()
    {
        return _policeOfficer;
    }

    public void setPoliceOfficer(PoliceOfficer policeOfficer)
    {
        _policeOfficer = policeOfficer;
    }

    @Override
    public String toString()
    {
        return "ParkingTicket [parkedCar=" + _parkedCar + ", fine=" + _fine + ", policeOfficer=" + _policeOfficer + "]";
    }
    
    public double computeFine(ParkingMeter parkingMeter)
    {
        double computedFine = 0.0;
        double computedHours = parkingMeter.computeExtraHours(_parkedCar);
        
        if(computedHours > 0) 
        {
            computedFine = ((computedHours - 1) * 10.00 ) + 25.00;
        }
        
        return computedFine;
    }
    
//    public void reportPoliceOfficer() 
//    {
//        System.out.println("Officer Name: " + _policeOfficer.getName() + "\n" + 
//                "Officer Batch Number: " + _policeOfficer.getBatchNumber()
//                );
//    }
}

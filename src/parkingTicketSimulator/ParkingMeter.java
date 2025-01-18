package parkingTicketSimulator;

public class ParkingMeter
{
    private int _minutesPurchased;

    public ParkingMeter(int minutesPurchased)
    {
        super();
        _minutesPurchased = minutesPurchased;
    }

    public int get_minutesPurchased()
    {
        return _minutesPurchased;
    }

    public void set_minutesPurchased(int _minutesPurchased)
    {
        this._minutesPurchased = _minutesPurchased;
    }

    @Override
    public String toString()
    {
        return "ParkingMeter [_minutesPurchased=" + _minutesPurchased + "]";
    }
    
    public double computeExtraHours(ParkedCar parkedCar) 
    {
        if (parkedCar.getMinsParked() > _minutesPurchased) 
        {  
             double computedHours = (parkedCar.getMinsParked() - _minutesPurchased) / 60;
             return computedHours;
        }
                    
        return 0;
    }
    
    public boolean isPurchasedTimeExpired(ParkedCar parkedCar) 
    {
        if(computeExtraHours(parkedCar) != 0) 
            return true;
        
        return false;
    }
}

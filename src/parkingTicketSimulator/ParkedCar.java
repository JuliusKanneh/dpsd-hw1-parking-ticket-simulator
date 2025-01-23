package parkingTicketSimulator;

public class ParkedCar
{
    private String _make;
    private String _model;
    private String _color;
    private String _licenseNumber;
    private int _minsParked;
    
    public ParkedCar(ParkedCar parkedCar) {
        _make = parkedCar.getMake();
        _model = parkedCar.getModel();
        _color = parkedCar.getColor();
        _licenseNumber = parkedCar.getLicenseNumber();
        _minsParked = parkedCar.getMinsParked();
    }
    
    public ParkedCar(String make, String model, String color, String licenseNumber, int minsParked)
    {
        super();
        _make = make;
        _model = model;
        _color = color;
        _licenseNumber = licenseNumber;
        _minsParked = minsParked;
    }

    public String getMake()
    {
        return _make;
    }

    public void setMake(String make)
    {
        _make = make;
    }

    public String getModel()
    {
        return _model;
    }

    public void setModel(String model)
    {
        _model = model;
    }

    public String getColor()
    {
        return _color;
    }

    public void setColor(String color)
    {
        _color = color;
    }

    public String getLicenseNumber()
    {
        return _licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber)
    {
        _licenseNumber = licenseNumber;
    }

    public int getMinsParked()
    {
        return _minsParked;
    }

    public void setMinsParked(int minsParked)
    {
        _minsParked = minsParked;
    }

    @Override
    public String toString()
    {
        return "ParkedCar [make=" + _make + ", model=" + _model + ", color=" + _color + ", licenseNumber=" + _licenseNumber
                + ", minsParked=" + _minsParked + "]";
    }
    
    
}

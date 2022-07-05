package model;

public class Vehicle {
    private String vehicleNumber;
    private String vehicleType;
    private String maximumMeight;
    private String numOfPassengers;
    private String driverNic;

    public Vehicle() {

    }

    public Vehicle(String vehicleNumber, String vehicleType, String maximumMeight, String numOfPassengers, String driverNic) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.maximumMeight = maximumMeight;
        this.numOfPassengers = numOfPassengers;
        this.driverNic = driverNic;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getMaximumMeight() {
        return maximumMeight;
    }

    public void setMaximumMeight(String maximumMeight) {
        this.maximumMeight = maximumMeight;
    }

    public String getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(String numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public String getDriverNic() {
        return driverNic;
    }

    public void setDriverNic(String driverNic) {
        this.driverNic = driverNic;
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", maximumMeight='" + maximumMeight + '\'' +
                ", numOfPassengers='" + numOfPassengers + '\'' +
                ", driverNic='" + driverNic + '\'' +
                '}';
    }
}

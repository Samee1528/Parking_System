package model;

public class Driver {
    private String driverName;
    private String nic;
    private String driverLicenseNum;
    private String address;
    private String contactNum;

    public Driver(String driverName, String nic, String driverLicenseNum, String address, String contactNum) {
        this.driverName = driverName;
        this.nic = nic;
        this.driverLicenseNum = driverLicenseNum;
        this.address = address;
        this.contactNum = contactNum;
    }

    public Driver() {
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDriverLicenseNum() {
        return driverLicenseNum;
    }

    public void setDriverLicenseNum(String driverLicenseNum) {
        this.driverLicenseNum = driverLicenseNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    @Override
    public String toString() {
        return "driver{" +
                "driverName='" + driverName + '\'' +
                ", nic='" + nic + '\'' +
                ", driverLicenseNum='" + driverLicenseNum + '\'' +
                ", address='" + address + '\'' +
                ", contactNum='" + contactNum + '\'' +
                '}';
    }
}

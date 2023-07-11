package entities.concretes.address;

import entities.abstracts.Address;

public class HomeAddress implements Address {
    private String city;
    private String town;
    private String street;
    private String buildName;
    private int doorNumber;

    public HomeAddress(String city, String town, String street, String buildName, int doorNumber) {
        this.city = city;
        this.town = town;
        this.street = street;
        this.buildName = buildName;
        this.doorNumber = doorNumber;
    }


    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getTown() {
        return this.town;
    }

    @Override
    public void setTown(String town) {
        this.town = town;
    }


    @Override
    public String getStreet() {
        return this.street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String getBuildOrCompanyName() {
        return this.buildName;
    }

    @Override
    public void setBuildOrCompanyName(String buildOrCompanyName) {
        this.buildName = buildOrCompanyName;
    }

    @Override
    public int getDoorOrComplexNumber() {
        return this.doorNumber;
    }

    @Override
    public void setDoorOrComplexNumber(int buildOrComplexNumber) {
        this.doorNumber = buildOrComplexNumber;
    }

    @Override
    public String toString() {
        return this.city + "/" + this.town + "/" + this.street + "/" + this.buildName + "/" + this.doorNumber;
    }
}

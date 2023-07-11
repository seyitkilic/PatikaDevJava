package entities.abstracts;

public interface Address {
    public String getCity();

    public void setCity(String city);

    public String getTown();

    public void setTown(String town);

    public String getStreet();

    public void setStreet(String street);

    public String getBuildOrCompanyName();

    public void setBuildOrCompanyName(String buildOrCompanyName);

    public int getDoorOrComplexNumber();

    public void setDoorOrComplexNumber(int buildOrComplexNumber);
}

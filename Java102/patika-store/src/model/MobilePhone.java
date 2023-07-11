package model;

public class MobilePhone extends Product {
    private int battery;
    private String color;
    private int camera;

    public MobilePhone(int id, double unitPrice, double discount, int stockAmount, String productName, Category category, Brand brand, int storage, double screenSize, int memory, int battery, String color, int camera) {
        super(id, unitPrice, discount, stockAmount, productName, category, brand, storage, screenSize, memory);
        this.battery = battery;
        this.color = color;
        this.camera = camera;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}

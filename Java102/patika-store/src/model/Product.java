package model;

public abstract class Product {
    private int id;
    private Category category;
    private Brand brand;
    private double unitPrice;
    private double discount;
    private int stockAmount;
    private String productName;
    private int storage;
    private double screenSize;
    private int memory;

    public Product(int id, double unitPrice, double discount, int stockAmount, String productName, Category category, Brand brand, int storage, double screenSize, int memory) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.stockAmount = stockAmount;
        this.productName = productName;
        this.category = category;
        this.brand = brand;
        this.storage = storage;
        this.screenSize = screenSize;
        this.memory = memory;
    }

    public void applyDiscount(double discount) {
        double newPrice = this.unitPrice * discount;
        this.unitPrice = newPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}

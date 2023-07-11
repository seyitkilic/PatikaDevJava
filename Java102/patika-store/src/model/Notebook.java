package model;

public class Notebook extends Product {
    public Notebook(int id, double unitPrice, double discount, int stockAmount, String productName, Category category, Brand brand, int storage, double screenSize, int memory) {
        super(id, unitPrice, discount, stockAmount, productName, category, brand, storage, screenSize, memory);
    }
}

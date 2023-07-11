package controller;

import model.Brand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BrandController {
    private List<Brand> brands = new ArrayList<>();

    public BrandController() {
        createDefaultBrands();
    }

    private void createDefaultBrands() {
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));
    }

    public List<Brand> getBrands() {
        Collections.sort(brands);
        return brands;
    }

    public Brand getBrandByName(String name) {
        for (Brand brand : this.brands) {
            if (brand.getName().equalsIgnoreCase(name)) return brand;
        }

        return null;
    }

    public Brand addNewBrand(String name) {
        Brand brand = new Brand(brands.size(), name);
        brands.add(brand);
        return brand;
    }

    public void deleteBrand(Brand brand) {
        brands.remove(brand);
    }
}

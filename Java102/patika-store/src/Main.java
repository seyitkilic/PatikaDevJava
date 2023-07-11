import controller.BrandController;
import controller.CategoryController;
import controller.ProductController;
import model.Brand;
import model.Category;
import model.MobilePhone;
import model.Notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        CategoryController categoryController = new CategoryController();
        BrandController brandController = new BrandController();
        ProductController productController = new ProductController(categoryController, brandController);
        PatikaStore patikaStore = new PatikaStore(categoryController, brandController, productController);
        patikaStore.menu();
    }
}
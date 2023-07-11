package controller;

import model.Category;
import model.MobilePhone;
import model.Notebook;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<Product> productList = new ArrayList<>();
    public static int lastId = 0;
    private CategoryController categoryController;
    private BrandController brandController;

    public ProductController(CategoryController categoryController, BrandController brandController) {
        this.categoryController = categoryController;
        this.brandController = brandController;
        createDefaultProducts();
    }

    private void createDefaultProducts() {
        productList.add(new MobilePhone(++lastId, 3199, 0, 1, "GALAXY A51", categoryController.getCategoryByName("phone"), brandController.getBrandByName("samsung"), 128, 6.5, 6, 4000, "Siyah", 32));
        productList.add(new MobilePhone(++lastId, 7379, 0, 1, "İPhone 11 64 GB", categoryController.getCategoryByName("phone"), brandController.getBrandByName("apple"), 64, 6.1, 6, 3046, "Mavi", 5));
        productList.add(new MobilePhone(++lastId, 4012, 0, 1, "Redmi Note 10 Pro 8 GB", categoryController.getCategoryByName("phone"), brandController.getBrandByName("xiaomi"), 128, 6.5, 12, 4000, "Beyaz", 35));
        productList.add(new Notebook(++lastId, 7000, 0, 1, "Matebook 14", categoryController.getCategoryByName("notebook"), brandController.getBrandByName("huawei"), 512, 14, 16));
        productList.add(new Notebook(++lastId, 3699, 0, 1, "V14 IGL", categoryController.getCategoryByName("notebook"), brandController.getBrandByName("lenovo"), 1024, 14, 8));
        productList.add(new Notebook(++lastId, 8199, 0, 1, "Tuf Gaming", categoryController.getCategoryByName("notebook"), brandController.getBrandByName("asus"), 2048, 15.6, 32));
    }

    public List<Product> getProductList() {
        return productList;
    }

    public List<Product> getProductListByCategory(String categoryName) {
        Category category = categoryController.getCategoryByName(categoryName);
        List<Product> products = new ArrayList<>();

        for (Product product : productList) {
            if (product.getCategory().equals(category)) products.add(product);
        }

        return products;
    }

    public Product getProductById(int id) {
        Product product = null;

        for (Product p : this.productList) {
            if (p.getId() == id) {
                product = p;
                break;
            }
        }

        return product;
    }

    public void deleteUncategorizedProducts() {
        for (Product product : productList) {
            if (product.getCategory() == null) {
                productList.remove(product);
            }
        }
    }

    public void deleteUnbrandedProducts() {
        for (Product product : productList) {
            if (product.getBrand() == null) {
                productList.remove(product);
            }
        }
    }

    public void addNewProduct(Product product) {
        productList.add(product);
    }

    public void deleteProduct(Product product) {
        productList.remove(product);
    }
}

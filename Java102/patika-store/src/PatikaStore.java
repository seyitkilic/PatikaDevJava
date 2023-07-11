import controller.BrandController;
import controller.CategoryController;
import controller.ProductController;
import model.*;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PatikaStore {
    private static final Scanner scanner = new Scanner(System.in);
    private CategoryController categoryController;
    private BrandController brandController;
    private ProductController productController;

    public PatikaStore(CategoryController categoryController, BrandController brandController, ProductController productController) {
        this.categoryController = categoryController;
        this.brandController = brandController;
        this.productController = productController;
    }

    public void menu() {
        System.out.println("********************************");
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Tüm Markaları Listele");
        System.out.println("0 - Çıkış Yap");
        System.out.println("********************************");

        int result = getProperIntFromUser(0, 3, "Tercihiniz : ");

        switch (result) {
            case 0 -> signOut();
            case 1 -> productOperations(false);
            case 2 -> productOperations(true);
            case 3 -> brandList();
        }
    }

    private void brandList() {
        System.out.println("Markalarımız");
        System.out.println("--------------");

        for (Brand brand : brandController.getBrands()) {
            System.out.println("- " + brand.getName());
        }

        menu();
    }

    private void signOut() {
        System.out.println("Çıkış Yapılıyor");
    }

    private void productOperations(boolean isPhone) {
        String productType = isPhone ? "Telefon" : "Notebook";

        System.out.println("********************************");
        System.out.println(productType + " İşlemleri");
        System.out.println("1 - Tüm " + productType + "ları listele");
        System.out.println("2 - Yeni " + productType + " ekle");
        System.out.println("3 - " + productType + " sil");
        System.out.println("0 - Ana menüye dön");
        System.out.println("********************************");

        int result = getProperIntFromUser(0, 3, "Tercihiniz : ");
        switch (result) {
            case 0 -> menu();
            case 1 -> listProducts(isPhone, true);
            case 2 -> addNewProduct(isPhone);
            case 3 -> deleteProduct(isPhone);
        }
    }

    private void deleteProduct(boolean isPhone) {
        listProducts(isPhone, false);

        Product product = null;
        while (product == null) {
            int deleteId = getProperIntFromUser(0, productController.lastId, "Silinmesini istediğiniz ürünün id numarasını giriniz (iptal için 0) : ");

            if (deleteId == 0) break;
            product = productController.getProductById(deleteId);
        }

        if (product != null) {
            int delete = getProperIntFromUser(1, 2, product.getId() + " id numaralı " + product.getProductName() + " isimli ürün silenecektir, onaylıyor musunuz? (evet için 1, hayır için 2 giriniz): ");

            if (delete == 1) {
                productController.deleteProduct(product);
                System.out.println(product.getProductName() + " silindi");
            } else {
                System.out.println("Silme işlemi iptal edildi");
            }
        }

        productOperations(isPhone);
    }

    private void listProducts(boolean isPhone, boolean showAfterMenu) {
        String categoryName = isPhone ? "Phone" : "Notebook";
        String title = isPhone ? "Telefon Listesi" : "Notebook Listesi";
        String productName = isPhone ? "Telefon Modeli" : "Notebook Modeli";

        List<Product> productList = productController.getProductListByCategory(categoryName);

        System.out.println("\n" + title + "\n");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| %2s | %-30s | %-9s | %-9s | %-9s | %-9s | %-9s |\n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
        System.out.println("----------------------------------------------------------------------------------------------------");

        for (Product product : productList) {
            System.out.printf("| %2d | %-30s | %-9.2f | %-9s | %-9s | %-9.1f | %-9d |\n", product.getId(), product.getProductName(), product.getUnitPrice(), product.getBrand().getName(), product.getStorage(), product.getScreenSize(), product.getMemory());

        }

        System.out.println("----------------------------------------------------------------------------------------------------");

        if (showAfterMenu) productOperations(isPhone);
    }

    private void addNewProduct(boolean isPhone) {
        System.out.println("Eklemek istediğiniz ürünün özelliklerini giriniz");
        scanner.nextLine();
        System.out.print("Ürün adı: ");
        String productName = scanner.nextLine().trim();

        System.out.print("Ürün markası: ");
        String brandName = scanner.nextLine().trim();
        Brand brand = brandController.getBrandByName(brandName);
        if (brand == null) brand = brandController.addNewBrand(brandName);

        System.out.print("Ürün kategorisi: ");
        String categoryName = scanner.nextLine().trim();
        Category category = categoryController.getCategoryByName(categoryName);
        if (category == null) category = categoryController.addNewCategory(categoryName);

        System.out.print("Ekran boyutu: ");
        double screenSize = scanner.nextDouble();

        System.out.print("RAM kapasitesi (GB): ");
        int memory = scanner.nextInt();

        System.out.print("Hafıza (GB): ");
        int storage = scanner.nextInt();

        double unitPrice = getProperDoubleFromUser(0, Double.MAX_VALUE, "Fiyat: ");

        double discount = getProperDoubleFromUser(0, Double.MAX_VALUE, "İndirim: ");

        int stockAmount = getProperIntFromUser(0, Integer.MAX_VALUE, "Stok Miktarı: ");

        Product product;
        if (isPhone) {
            int battery = getProperIntFromUser(0, Integer.MAX_VALUE, "Batarya Kapasitesi: ");

            System.out.print("Renk: ");
            scanner.nextLine();
            String color = scanner.nextLine().trim();

            int camera = getProperIntFromUser(0, Integer.MAX_VALUE, "Kamera Çözünürlüğü: ");

            product = new MobilePhone(++productController.lastId, unitPrice, discount, stockAmount, productName, category, brand, storage, screenSize, memory, battery, color, camera);
        } else {
            product = new Notebook(++productController.lastId + 1, unitPrice, discount, stockAmount, productName, category, brand, storage, screenSize, memory);
        }

        productController.addNewProduct(product);
        productOperations(isPhone);
    }

    private double getProperDoubleFromUser(double min, double max, String message) {
        double input;

        while (true) {
            System.out.print(message);
            try {
                input = scanner.nextDouble();
                if (input >= min && input <= max) break;
                else throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Hatalı Giriş, tekrar deneyiniz");
                scanner.next();
            }
        }

        return input;
    }

    private int getProperIntFromUser(int min, int max, String message) {
        int selection;

        while (true) {
            System.out.print(message);
            try {
                selection = scanner.nextInt();
                if (selection >= min && selection <= max) break;
                else throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry!");
                scanner.next();
            }
        }

        return selection;
    }
}

package controller;

import model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryController {
    private List<Category> categories = new ArrayList<>();

    public CategoryController() {
        createDefaultCategories();
    }

    private  void createDefaultCategories() {
        categories.add(new Category(1, "Phone"));
        categories.add(new Category(2, "Notebook"));
    }

    public List<Category> getCategories() {
        return categories;
    }

    public Category getCategoryByName(String name) {
        for (Category category : categories) {
            if (category.getCategoryName().equalsIgnoreCase(name)) {
                return category;
            }
        }

        return null;
    }

    public Category addNewCategory(String name) {
        Category category = new Category(categories.size(), name);
        categories.add(category);
        return category;
    }
}

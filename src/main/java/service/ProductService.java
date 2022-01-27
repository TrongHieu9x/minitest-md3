package service;

import model.Product;

import java.util.ArrayList;

public class ProductService {
    private static final ArrayList<Product> products;

    static {
        products = new ArrayList<>();
        products.add(new Product(1, "Tao", 5000, 20, "do"));
        products.add(new Product(2, "Le", 10000, 25, "vang"));
        products.add(new Product(3, "mut", 15000, 15, "trang"));
    }

    public ArrayList<Product> getProductList() {
        return products;
    }

    public Product getProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void createProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public void editProduct(int index, Product product) {
        products.set(index, product);
    }

    public static ArrayList<Product> sortProductAscending() {
        products.sort((o1, o2) -> (int) (o1.getPrice()-o2.getPrice()));
        return products;
    }

    public static ArrayList<Product> sortProductDescending() {
        products.sort((o1, o2) -> (int) (o2.getPrice()-o1.getPrice()));
        return products;
    }

    public ArrayList<Product> Display() {
        return products;
    }
}

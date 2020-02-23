package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {
    String name;
    private List<Product> allProducts;

    public void addProduct(Product p){
        System.out.println("calling addProduct (Product p) ");
        allProducts.add(p);
    }

    public void addProduct (String productName, int productPrice){

        Product newProduct = new Product (productName, productPrice);
        allProducts.add(newProduct);
    }

    public Store () {
        this.name = "Cybertek Store";
        this.allProducts=new ArrayList<>();
    }

    public Store(String name, List<Product> allProducts) {
        this();
        this.name = name;
        this.allProducts = allProducts;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }
}

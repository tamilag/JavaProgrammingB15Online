package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest {
    public static void main(String[] args) {
        Store s1 = new Store ();
        System.out.println(s1.name);
//        System.out.println("s1.allProducts = " + s1.allProducts);
        
//        s1.allProducts.add (new Product ("imac", 3999));
//        System.out.println("s1.allProducts = " + s1.allProducts);

        List<Product>denisList = Arrays.asList(new Product("cookie", 3), 
        new Product("tea", 3), new Product("coffee", 2));
        Store s2 = new Store("Denis Coffee Shop", denisList);
        System.out.println("s2 = " + s2);
//        Product p1 = new Product("Cheescake", 10);
//        s2.addProduct(p1);
//        s2.addProduct(new Product("Cheescake", 10));
//        s2.addProduct("Latte", 3);
    }


}

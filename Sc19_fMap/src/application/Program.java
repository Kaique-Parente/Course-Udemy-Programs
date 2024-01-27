package application;

import java.util.HashMap;
import java.util.Map;
import model.entities.Product;

public class Program {
    public static void main(String[] args) {
        
       Map<Product, Double> stock = new HashMap<>();
       
       Product p1 = new Product("Tv", 900.00);
       Product p2 = new Product("Notebook", 2300.00);
       Product p3 = new Product("Tablet", 1500.00);
       
       stock.put(p1, 10000.00);
       stock.put(p2, 2000.00);
       stock.put(p3, 15000.00);
       
       Product ps = new Product("Tv", 900.00);
       
       System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}

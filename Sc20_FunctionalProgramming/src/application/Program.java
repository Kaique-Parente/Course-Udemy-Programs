package application;

import entities.Product;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();
        
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
               return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };
        
        list.sort(comp);
        
        for(Product x: list) {
            System.out.println(x);
        }
    }
}

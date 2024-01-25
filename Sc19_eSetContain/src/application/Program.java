package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import model.entities.Product;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Set <Product> set = new HashSet<>();
        
        set.add(new Product("Tablet", 1200.50));
        set.add(new Product("Tv", 3500.00));
        set.add(new Product("Cellphone", 5700.00));
        
        Product ps = new Product("Tv", 3500.00);
        
        System.out.println(set.contains(ps));
        
    }
}

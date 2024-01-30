package application;

import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import model.services.ProductService;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
        
        ProductService ps = new ProductService();
        
        Scanner sc = new Scanner(System.in);
        
        char test = sc.next().toUpperCase().charAt(0);
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == test);
        
        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner e = new Scanner(System.in);
        
        int n = e.nextInt();
        Product[] vect = new Product[n];
        
        for (int i = 0; i < n; i++) {
            e.nextLine();
            String name = e.nextLine();
            double price = e.nextDouble();
            vect[i] = new Product(name, price);
        }
        
        double sum = 0.0;
        
        for(int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }
        
        double avg = sum / n;
        
        System.out.printf("AVERAGE PRICE = %.2f\n", avg);
    }
}

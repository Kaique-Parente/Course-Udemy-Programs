package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class Program2 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner e = new Scanner(System.in);
        
        System.out.println("Enter Product data:");
        System.out.print("Name: ");
        String name = e.nextLine();
        System.out.print("Price: ");
        double price = e.nextDouble();
        Product2 product = new Product2(name, price);
        
        System.out.println("");
        System.out.println("Product Data: " + product);
        
        System.out.println("");
        System.out.print("Enter the number of products to be added in stock: ");
        int addQuantity = e.nextInt();
        
        
        product.addProducts(addQuantity);
        
        System.out.println("");
        System.out.println("Updated Data: " + product);
        
        System.out.println("");
        System.out.print("Enter the number of products to be removed from stock: ");
        int quantity = e.nextInt();
        
        product.removeProducts(quantity);
        
        System.out.println("");
        System.out.println("Updated Data: " + product);
    }
}

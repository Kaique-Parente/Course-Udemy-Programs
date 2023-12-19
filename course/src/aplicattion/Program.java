package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner e = new Scanner(System.in);
        
        Product product = new Product();
        System.out.println("Enter Product data:");
        System.out.print("Name: ");
        product.name = e.nextLine();
        System.out.print("Price: ");
        product.price = e.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = e.nextInt();
        
        System.out.println("");
        System.out.println("Product Data: " + product);
        
        System.out.println("");
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = e.nextInt();
        
        product.addProducts(quantity);
        
        System.out.println("");
        System.out.println("Updated Data: " + product);
        
        System.out.println("");
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = e.nextInt();
        
        product.removeProducts(quantity);
        
        System.out.println("");
        System.out.println("Updated Data: " + product);
    }
}

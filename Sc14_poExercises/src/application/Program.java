package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner e = new Scanner(System.in);
        
        List<Product> product = new ArrayList<>();
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.print("Enter the number of products: ");
        int n = e.nextInt();
        System.out.println("");
        
        for(int i = 0; i < n; i++) {
            System.out.println("Product #" + (i+1) + " data");
            System.out.print("Common, used or imported (c/u/i)? ");
            char choice = e.next().charAt(0);
            e.nextLine();
            System.out.print("Name: ");
            String name = e.nextLine();
            System.out.print("Price: ");
            double price = e.nextDouble();
            
            if(choice == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(e.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                product.add(new UsedProduct(manufactureDate, name, price));
            } else if (choice == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = e.nextDouble();
                product.add(new ImportedProduct(customsFee, name, price));
            } else {
                product.add(new Product(name, price));
            }
            System.out.println("");
        }
        
        System.out.println("PRICE TAGS:");
        for(Product c : product) {
            System.out.println(c.priceTag());
        }
    }
}

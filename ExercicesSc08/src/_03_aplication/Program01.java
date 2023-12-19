package _03_aplication;

import java.util.Scanner;
import java.util.Locale;

import _01_entities.Rectangle;

public class Program01 {
    
     public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner e = new Scanner(System.in);
        
        Rectangle rectangle = new Rectangle();
        
        System.out.println("Enter rectangle width and height:");
        rectangle.width = e.nextDouble();
        rectangle.height = e.nextDouble();
        
         System.out.println(rectangle);
    }
}

package application;

import java.util.Scanner;
import java.util.Locale;

import util.Calculator_V3;

public class ProgramV3 {
            
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner e = new Scanner(System.in);
         
         System.out.print("Enter radius: ");
         double radius = e.nextDouble();
         
         double c = Calculator_V3.circumference(radius);
         double v = Calculator_V3.volume(radius);
         
         System.out.printf("Circumference: %.2f\n", c);
         System.out.printf("Volume: %.2f\n", v);
         System.out.printf("PI Value: %.5f\n", Calculator_V3.PI);
         
    }
    
    
}

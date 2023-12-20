package application;

import java.util.Scanner;
import java.util.Locale;

import util.Calculator_V2;

public class ProgramV2 {
            
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner e = new Scanner(System.in);
         
         System.out.print("Enter radius: ");
         double radius = e.nextDouble();
         
         Calculator_V2 calc = new Calculator_V2();
         
         double c = calc.circumference(radius);
         double v = calc.volume(radius);
         
         System.out.printf("Circumference: %.2f\n", c);
         System.out.printf("Volume: %.2f\n", v);
         System.out.printf("PI Value: %.5f\n", calc.PI);
         
    }
    
    
}

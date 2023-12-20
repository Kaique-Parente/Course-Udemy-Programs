package application;
import java.util.Scanner;
import java.util.Locale;

import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner e = new Scanner(System.in);
         
         System.out.print("What is the dollar price? ");
         double dollarPrice = e.nextDouble();
         
         System.out.print("How many dollars will be bought? ");
         double dollarsBought = e.nextDouble();
         
         System.out.printf("Amount to be paid in reais = %.2f\n", CurrencyConverter.calculator(dollarPrice, dollarsBought));

    }
}

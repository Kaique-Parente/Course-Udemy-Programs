package application;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double limit = sc.nextDouble();
            System.out.println("");
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            Account account = new Account(number, name, balance, limit);
            
            account.withdraw(amount);
            System.out.printf("New balance: %.2f\n" + account.getBalance());
            
        } catch (DomainException e) {
            System.out.print("Withdraw error: " + e.getMessage());
            System.out.println("");
        } catch(RuntimeException e) {
            System.out.println("Error!");
        }

    }
}

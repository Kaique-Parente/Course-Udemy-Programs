package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for (Account c : list) {
                    sum += c.getBalance();
                }
                
                System.out.println("Total: " + sum + "\n");
                
                for (Account c : list) {
                    c.deposit(10.0);
                }
                
                for (Account c : list) {
                    System.out.println("Number: " + c.getNumber() + "\nBalance: " + c.getBalance() + "\n");
                }
	}
}
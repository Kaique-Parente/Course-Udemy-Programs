package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Pablo", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());
        
        Account acc2 = new SavingsAccount(0.01, 1002, "José", 1000.0);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());
        
        Account acc3 = new BusinessAccount(2000.0, 1003, "Vagner", 1000.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}

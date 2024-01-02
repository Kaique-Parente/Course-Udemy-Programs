
package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Alex", 0.0);
        
        //UPCASTING
        Account acc2 = new BusinessAccount(500.00, 1002, "Bob", 0.0);
        Account acc3 = new BusinessAccount(1.0, 1003, "Maria", 0.0);
        
        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(500.00);
        
        if(acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!\n" + acc5);
        }
        
        if(acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Updtade Balance!\n" + acc5);
        }
    }
}

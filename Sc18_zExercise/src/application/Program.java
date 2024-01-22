package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Among the contract data:");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fm1);
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();
        Contract cr = new Contract(number, date, totalValue);
        
        System.out.print("Enter the number of installments: ");
        int installments = sc.nextInt();
        
        ContractService service = new ContractService(new PaypalService());
        service.processContract(cr, installments);
        System.out.println("Installments:");
        for(Installment x : cr.getInstallments()) {
            System.out.println(x);
        }
    }
}

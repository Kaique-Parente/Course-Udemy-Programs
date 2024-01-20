package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String model = sc.nextLine();
        
        System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fm1);
        System.out.print("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fm1);
        CarRental cr = new CarRental(start, finish, new Vehicle(model));
      
        System.out.print("Enter price per hour: ");
        Double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        Double pricePerDay = sc.nextDouble();
        
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("INVOICE:");
        System.out.printf("Basic payment: %.2f\n", cr.getInvoice().getBasicPayment());
        System.out.printf("Tax: %.2f\n", cr.getInvoice().getTax());
        System.out.printf("Total payment: %.2f\n", cr.getInvoice().getTotalPayment());
    }
}

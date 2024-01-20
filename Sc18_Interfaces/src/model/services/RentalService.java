package model.services;

import java.time.Duration;
import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;
    
    private BrazilTaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public BrazilTaxService getTaxService() {
        return taxService;
    }
    
    public void processInvoice(CarRental carRental) {
        
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;
        
        double days = hours / 24.0;
        
        double basicPayment;
        
        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(days);
        }
        
        double tax = taxService.tax(basicPayment);
        
        carRental.setInvoice(new Invoice(basicPayment, tax)); 
    }
}

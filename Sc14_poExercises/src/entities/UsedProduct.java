package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;
    private static DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public UsedProduct() {
        super();
    }

    public UsedProduct(LocalDate manufactureDate, String name, Double price) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    @Override
    public String priceTag() {
        return String.format("%s (used) $ %.2f (Manufacture date: %s)", name, price, manufactureDate.format(fm1));
    }
}

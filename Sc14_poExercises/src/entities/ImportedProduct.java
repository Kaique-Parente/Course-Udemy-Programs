package entities;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(Double customsFee, String name, Double price) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getcustomsFee() {
        return customsFee;
    }

    public void setcustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    public Double totalPrice() {
        return price += customsFee;
    }

    @Override
    public String priceTag() {
        return String.format("%s $ %.2f (Customs fee: $ %.2f)", name, totalPrice(), customsFee);
    } 
}

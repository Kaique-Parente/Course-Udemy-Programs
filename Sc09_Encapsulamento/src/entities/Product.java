package entities;

public class Product {
    // Atributos
    private String name;
    private double price;
    private int quantity;
    
    //Construtores
    
    
    //Metoodos
    
    public double totalValueInStock() {
        return price * quantity;
    }
    
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    
    public String toString() {
        return  name + ", $ " + 
                String.format("%.2f", price) + 
                ", " + 
                quantity + " units, Total: $ " + 
                String.format("%.2f", totalValueInStock());
    }
}

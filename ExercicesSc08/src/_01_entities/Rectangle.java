package _01_entities;

public class Rectangle {
    
    public double width;
    public double height;
    
    public double Area () {
        return width * height;
    }
    
    public double Perimeter() {
        return 2 * (width + height);
    }
    
    public double Diagonal () {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
    
    public String toString () {
        return String.format("Area = %.2f\n", Area()) 
                + String.format("Perimeter = %.2f\n", Perimeter())
                + String.format("Diagonal = %.2f", Diagonal());
    }
}

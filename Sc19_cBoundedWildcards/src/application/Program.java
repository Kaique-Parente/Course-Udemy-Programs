package application;

import java.util.ArrayList;
import java.util.List;
import model.entities.Circle;
import model.entities.Shape;

public class Program {
    public static void main(String[] args) {
       List <Circle> list = new ArrayList<>();
       
       list.add(new Circle(2.0));
       list.add(new Circle(4.0));
       list.add(new Circle(1.0));
       
       System.out.println("Sum: " + totalArea(list));
    }
    
    public static Double totalArea(List <? extends Shape> list) {
        
        double sum = 0.0;
        for(Shape x : list) {
            sum += x.area();
        }
        return sum;
    }
}

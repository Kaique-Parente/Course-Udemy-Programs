
import java.util.Locale;
import java.util.Scanner;

public class Class1 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double aX, bX, cX, aY, bY, cY, areaX, areaY;
        
        System.out.println("Enter the measures of triangle X:");
        aX = sc.nextDouble();
        bX = sc.nextDouble();
        cX = sc.nextDouble();
        
        areaX = calculoArea(aX, bX, cX);
        
        System.out.println("Enter the measures of triangle Y:");
        aY = sc.nextDouble();
        bY = sc.nextDouble();
        cY = sc.nextDouble();
        
        areaY = calculoArea(aY, bY, cY);
        
        
        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);
        
        max(areaX, areaY);

        System.exit(0);
    }
    
    public static double calculoArea(double a, double b, double c) {
        double area, p;
        
        p = (a + b + c)/2;
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
        return area;
    }
    
    public static void max(double areaX, double areaY) {
        if(areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
    }
    }

}

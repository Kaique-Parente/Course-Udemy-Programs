package application;

import java.util.Scanner;
import services.PrintService;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        PrintService ps = new PrintService();
        
        System.out.print("How many values? ");
        int v = sc.nextInt();
        
        for(int i=1; i <= v; i++) {
            ps.addValue(sc.nextInt());
        }
        ps.print();
        System.out.println("First: " + ps.first());
    }
}

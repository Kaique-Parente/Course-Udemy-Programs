package application;

import java.util.Scanner;
import services.PrintServiceString;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        PrintServiceString ps = new PrintServiceString();
        
        System.out.print("How many values? ");
        int v = sc.nextInt();
        sc.nextLine();
        
        for(int i=1; i <= v; i++) {
            ps.addValue(sc.nextLine());
        }
        ps.print();
        System.out.println("First: " + ps.first());
    }
}

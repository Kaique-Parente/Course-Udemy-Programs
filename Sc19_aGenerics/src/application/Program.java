package application;

import java.util.Scanner;
import services.PrintService;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        PrintService<String> ps = new PrintService<>();
        
        System.out.print("How many values? ");
        int v = sc.nextInt();
        sc.nextLine();
        
        for(int i=1; i <= v; i++) {
            ps.addValue(sc.nextLine());
        }
        String x = ps.first();
        ps.print();
        System.out.println("First: " + x);
    }
}

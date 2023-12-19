package _02_aplication;

import java.util.Scanner;
import java.util.Locale;

import _02_entities.Employee;

public class Program01 {
    
     public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner e = new Scanner(System.in);
        
        Employee employee = new Employee();
        
        System.out.print("Name: ");
        employee.name = e.nextLine();
        
        System.out.print("Gross salary: ");
        employee.grossSalary = e.nextDouble();
        
        System.out.print("Tax: ");
        employee.tax = e.nextDouble();
        
         System.out.println("Employee: " + employee);
         
         System.out.print("Wich percentage to increase salary? ");
         employee.tax = e.nextDouble();
         
         System.out.println("Updated data: " + employee);
    }
}

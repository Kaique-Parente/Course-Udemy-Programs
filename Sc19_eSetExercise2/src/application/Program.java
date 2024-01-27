package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import model.entities.Student;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Set<Student> set = new HashSet<>();
        
        System.out.print("How many students for course A? ");
        int a = sc.nextInt();
        
        for(int i = 1; i <= a; i++) {
            set.add(new Student(sc.nextInt()));
        }
        
        System.out.print("How many students for course B? ");
        int b = sc.nextInt();
        
        for(int i = 1; i <= b; i++) {
            set.add(new Student(sc.nextInt()));
        }
        
        System.out.print("How many students for course C? ");
        int c = sc.nextInt();
        
        for(int i = 1; i <= c; i++) {
            set.add(new Student(sc.nextInt()));
        }
        
        System.out.println("Total students: " + set.size());
    }
}

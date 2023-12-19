package _03_aplication;

import java.util.Scanner;
import java.util.Locale;

import _03_entities.Student;

public class Program03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner e = new Scanner(System.in);

        Student student = new Student();
        
        System.out.print("Name: ");
        student.name = e.nextLine();
        
        System.out.print("Grade 1: ");
        student.grade1 = e.nextDouble();
        
        System.out.print("Grade 2: ");
        student.grade2 = e.nextDouble();
        
        System.out.print("Grade 3: ");
        student.grade3 = e.nextDouble();    

        System.out.printf("FINAL GRADE = %.2f\n", student.finalGrade());

        if (student.finalGrade() <= 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS\n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }

    }
}

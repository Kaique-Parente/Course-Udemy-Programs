package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person3;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner e = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = e.nextInt();
        
        Person3[] vect = new Person3[n];
        
        for(int i = 0; i < vect.length; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double altura = e.nextDouble();

            System.out.printf("Genero da %da pessoa: ", i + 1);
            char gender = e.next().charAt(0);
            
            vect[i] = new Person3(altura, gender);
        }
        
        double maiorAltura = vect[0].getAltura();
        double menorAltura = vect[0].getAltura();
        
        for(int i = 0; i < vect.length; i++) {
            if(vect[i].getAltura() > maiorAltura) {
                maiorAltura = vect[i].getAltura();
            } else if(vect[i].getAltura() < menorAltura) {
                menorAltura = vect[i].getAltura();
            }   
        }
        
        System.out.printf("Menor Altura = %.2f\n", menorAltura);
        System.out.printf("Maior Altura = %.2f\n", maiorAltura);
        
        double sum = 0.0; int nMulheres = 0; int nHomens = 0;
        
        for(int i = 0; i < vect.length; i++) {
            if(vect[i].getGender() == 'F') {
                sum += vect[i].getAltura();
                nMulheres++;
            } else {
                nHomens++;
            }
        }
        
        double avg = sum / nMulheres;
        
        System.out.printf("Media das alturas das mulheres = %.2f\n", avg);
        System.out.println("Numero de Homens = " + nHomens);
    }
}
 
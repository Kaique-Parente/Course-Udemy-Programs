package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner e = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = e.nextInt();
        int idadeMenor = 0;

        Person[] vect = new Person[n];
       

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Name: ");
            String name = e.next();

            System.out.print("Idade: ");
            
            int idade = e.nextInt();

            if (idade < 16) {
                idadeMenor++;
            }

            System.out.print("Altura: ");
            double altura = e.nextDouble();
            vect[i] = new Person(name, idade, altura);
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getAltura();
        }

        double avg = sum / vect.length;

        double percentMenores = ((double) idadeMenor / vect.length) * 100.0;

        System.out.println("");
        System.out.printf("Altura média: %.2f\n", avg);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentMenores);
        
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.printf("%s\n",vect[i].getName());
            }
        }

    }
}

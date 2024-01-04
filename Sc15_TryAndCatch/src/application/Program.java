
package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
        try {
            String[] vect = e.nextLine().split(" ");
            int position = e.nextInt();
            System.out.println(vect[position]);
        }
        catch(ArrayIndexOutOfBoundsException v) {
            System.out.println("Posição Inválida!");
        }
        catch(InputMismatchException v) {
            System.out.println("Digite Corretamente!");
        }
        System.out.println("");
        System.out.println("Programa Finalizado!");
    }
}

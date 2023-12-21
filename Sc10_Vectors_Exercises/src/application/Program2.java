package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner e = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = e.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            vectA[i] = e.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++) {
            vectB[i] = e.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < n; i++) {
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);
        }

    }
}

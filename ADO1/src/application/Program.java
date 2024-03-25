package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantas linhas você deseja: ");
        int l = sc.nextInt();
        System.out.print("Digite quantas colunas você deseja: ");
        int c = sc.nextInt();

        int m[][] = new int[l][c];

//Carregar matriz 
        for (int i = 0; i < l; i++) {
            for (int v = 0; v < c; v++) {
                m[i][v] = 0;
            }
        }

//Descarregar matriz
        for (int i = 0; i < l; i++) {
            for (int v = 0; v < c; v++) {
                System.out.print(m[i][v]);
            }
            System.out.printf("%n");
        }
    }
}

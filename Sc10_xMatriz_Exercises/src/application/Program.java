package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner e = new Scanner(System.in);

        int m = e.nextInt();
        int n = e.nextInt();
        System.out.println("");
        
        int[][] mat = new int[m][n];
        
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                mat[i][j] = e.nextInt();
            }
        }
        
        int x = e.nextInt();
        System.out.println("");
        
        for(int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == x) {
                    System.out.printf("Position %d,%d:\n", i, j);
                    if(j > 0) {
                         System.out.println("Left: " + mat[i][j-1]);
                    }
                    if(i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length - i) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length) {
                        System.out.println("Down: " + mat[i+1][j]);
                    } 
                    System.out.println("");
                }
            }
        }
    }
}

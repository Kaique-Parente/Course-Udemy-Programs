package application;

import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        
        File path = new File (strPath); // Caminho
        
        System.out.println("FOLDERS:");
        File[] folders = path.listFiles(File::isDirectory); // Pastas
        for(File file : folders) {
            System.out.println(file);
        }
        
        System.out.println("FILES:");
        File[] files = path.listFiles(File::isFile);  // Arquivos
        for(File file : files) {
            System.out.println(file);
        }
        
        boolean sucess = new File(strPath + "\\TESTE").mkdir();
        System.out.println("Directory created successfully: " + sucess);
    }
}

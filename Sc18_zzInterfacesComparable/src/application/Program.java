package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        String path = "C:\\Archives\\in.txt";
        String pathes = "C:\\Archives";
        List<String> list = new ArrayList<>();
        List<String> names = new ArrayList<>();
       
        for(int i = 1; i <= 1000; i++) {
            names.add("SIM");
        }
        
        names.toArray();
        String resultado = String.join(", ", names);
       
        File p3 = new File(pathes + "\\Resposta.txt");
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(p3))) {
            
            /*for(String x: names) {
                bw.write(x);
                bw.newLine();
            }
            */
            
            bw.write(resultado);
        }
        catch(IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
           String name = br.readLine();
           
           while(name != null) {
               list.add(name);
               name = br.readLine();
           }
           Collections.sort(list);
           
           for(String x: list) {
               System.out.println(x);
           }
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

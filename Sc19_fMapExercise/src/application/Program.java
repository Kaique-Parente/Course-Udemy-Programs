package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Map<String, Integer> candidate = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter file full path: ");
	String path = sc.nextLine();
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String line = br.readLine();
            
            while(line != null) {
                
              String[] fields = line.split(",");
              String name = fields[0];
              int votes = Integer.parseInt(fields[1]);
              
              if(candidate.containsKey(name)) {
                  int votesSoFar = candidate.get(name);
                  candidate.put(name, votesSoFar + votes);
              } else {
                  candidate.put(name, votes);
              }
              
              line = br.readLine();
            }
            
            for(String key : candidate.keySet()) {
                System.out.println(key + ": " + candidate.get(key));
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

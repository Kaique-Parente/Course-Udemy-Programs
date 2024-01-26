package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import model.entities.LogEntry;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Set<LogEntry> set = new HashSet<>();
        
        System.out.print("Enter file full path: ");
        String path = sc.next();
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String line = br.readLine();
            
            while(line != null) {
               String[] fields = line.split(" ");
               set.add(new LogEntry(fields[0], LocalDateTime.parse(fields[1], DateTimeFormatter.ISO_DATE_TIME)));
               line = br.readLine();
            }
            
            System.out.print("Total users: " + set.size());
            System.out.println("");
            
        }
        catch(IOException e) {
            throw new IllegalAccessError("File does not exist");
        }
    }
}

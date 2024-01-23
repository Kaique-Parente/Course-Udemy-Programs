package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import model.entities.Employee;

public class Program {
    public static void main(String[] args) {
        
        String path = "C:\\Archives\\in.txt";
        List<Employee> list = new ArrayList<>();
        Locale.setDefault(Locale.US);
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
           
           String employeeCsv = br.readLine();
           
           while(employeeCsv != null) {
               String[] fields = employeeCsv.split(",");
               list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
               employeeCsv = br.readLine();
           }
           Collections.sort(list);
           
           for(Employee x: list) {
               System.out.println(x.getName() + ", " + String.format("%.2f", x.getSalary()));
           }
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

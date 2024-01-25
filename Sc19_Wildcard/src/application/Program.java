package application;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List <String> list = Arrays.asList("Maria, Eduardo, Alex");
        printList(list);
    }
    
    public static void printList(List<?> list) {
        for(Object obj : list) {
            System.out.println(obj);
        }
    }
}

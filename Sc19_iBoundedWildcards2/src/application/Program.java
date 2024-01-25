package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(5, 4, 10);
        List<Double> doubleList = Arrays.asList(3.10, 5.11, 4.32);
        List<Object> myObj = new ArrayList<>();
        
        copy(intList, myObj);
        printList(myObj);
        copy(doubleList, myObj);
        printList(myObj);
    }
    
    public static void copy (List<? extends Number> source, List<? super Number> destiny) {
        for(Number x: source) {
            destiny.add(x);
        }
    }
    
    public static void printList(List<?> list) {
        for(Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println("");
    }
}

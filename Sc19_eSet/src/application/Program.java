package application;

import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        
        set.add("Tv");
        set.add("Tablet");
        set.add("Iphone");
        
        for(String x: set) {
            System.out.println(x);
        }
    }
}

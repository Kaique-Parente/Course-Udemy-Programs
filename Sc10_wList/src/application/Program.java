package application;

import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        List<String> list = new ArrayList<>();
        
        list.add("Maria");
        list.add("Jose");
        list.add("Alex");
        list.add("Mario");
        list.add("Junior");
        
        System.out.println("list size: " + list.size());
        
        for(String x : list) {
            System.out.println(x);
        }
        System.out.println("--------------------------");
        
        list.removeIf(x -> x.charAt(0) == 'M');
        
        for(String x : list) {
            System.out.println(x);
        }
        System.out.println("--------------------------");
        
        System.out.println("Index of Alex: " + list.indexOf("Alex"));
        System.out.println("Index of Mario: " + list.indexOf("Mario"));
        
        System.out.println("--------------------------");
                         // Transformo em stream       uso lambda          e transformo em lista de novo
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x : result) {
            System.out.println(x);
        }
        
        System.out.println("--------------------------");
        
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
        
        System.out.println("--------------------------");
        
        System.out.println(list);
    }
}

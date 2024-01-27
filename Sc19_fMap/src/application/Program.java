package application;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        
        Map<String, String> cookies = new LinkedHashMap<>();
        
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "9911111132232333");
        
        cookies.remove("email");
        cookies.put("phone", "98321321323");

        System.out.println("ALL Cookies:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
        
        cookies.put("phone", "9911111132232333");
        
        System.out.println("Contains new phone key: " + cookies.containsKey("phone"));
        System.out.println("");
        
        System.out.println("New Phone: " + cookies.get("phone"));
        System.out.println("Size: " + cookies.size());     
    }
}

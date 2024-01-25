package application;

import model.entities.Client;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");
        
        System.out.println("HashCodes:");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println("");
        
        System.out.println("Equals:");
        System.out.println(c1.equals(c2));
        System.out.println("");
        
        System.out.println("Test:");
        String a = "abc";
        String b = "abc";
        System.out.println(a == b);
        System.out.println(c1 == c2);
    }
}

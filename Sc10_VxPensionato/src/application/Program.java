package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner e = new Scanner(System.in);
        
        Rooms[] rooms = new Rooms[10];
        
        System.out.print("How many rooms will be rented? ");
        int n = e.nextInt();
        System.out.println("");
        
        for(int i = 0; i < n; i++) {
            System.out.printf("Rent #%d\n", i + 1);
            System.out.print("Name: ");
            e.nextLine();
            String name = e.nextLine();
            
            System.out.print("Email: ");
            String email = e.nextLine();
            
            System.out.print("Room: ");
            int nRoom = e.nextInt();
            System.out.println("");
            
            rooms[nRoom] = new Rooms(name, email, nRoom);
        }
        
        System.out.println("Busy rooms:");
       for(int i = 0; i < rooms.length; i++){
           if(rooms[i] != null) {
               System.out.println(i + ": " + rooms[i]);
           }
       }
    }
}

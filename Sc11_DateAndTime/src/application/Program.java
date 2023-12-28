package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        
        LocalDate d04 = LocalDate.parse("2020-07-15");
        LocalDateTime d05 = LocalDateTime.parse("2020-07-15T17:54:23");
        Instant d06 = Instant.parse("2020-04-30T20:56:32Z");
        Instant d07 = Instant.parse("2020-04-30T20:56:32-03:00");
        
        LocalDate d08 = LocalDate.parse("25/04/2003", fm1);
        LocalDateTime d09 = LocalDateTime.parse("25/04/2003 01:30", fm2);
        
        LocalDate d10 = LocalDate.of(1994, 6, 23);
        LocalDateTime d11 = LocalDateTime.of(1994, 6, 23, 1, 30);
        
        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());
        
        // Formatter
        
        
    }
}

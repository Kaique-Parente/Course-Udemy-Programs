package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Program2 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2020-07-15");
        LocalDateTime d05 = LocalDateTime.parse("2020-07-15T17:54:23");
        Instant d06 = Instant.parse("2020-04-30T01:30:32Z");
        
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fm4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fm5 = DateTimeFormatter.ISO_INSTANT;
        
        System.out.println("d04 = " + d04.format(fm1));
        System.out.println("d04 = " + fm1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("");

        
        System.out.println("d05 = " + d05.format(fm1));
        System.out.println("d05 = " + d05.format(fm2));
        System.out.println("d05 = " + d05.format(fm4));
        System.out.println("");
        
        
        System.out.println("d06 = " + fm3.format(d06)); // DIA DIFERENTE
        System.out.println("d06 = " + fm5.format(d06)); 
        System.out.println("d06 = " + d06.toString());
    }
}

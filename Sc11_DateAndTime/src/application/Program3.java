package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.ZoneId;

public class Program3 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2020-07-15");
        LocalDateTime d05 = LocalDateTime.parse("2020-07-15T17:54:23");
        Instant d06 = Instant.parse("2020-04-30T01:30:32Z");
        
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        
        System.out.println("r1 Brasil = " + r1); // Day 29
        System.out.println("r2 Portugal = " + r2); 
        System.out.println("");
        
        System.out.println("r3 Brasil = " + r3); 
        System.out.println("r4 Portugal = " + r4); 
        
        System.out.println("");
        
        System.out.println("d04 day = " + d04.getDayOfMonth());
        System.out.println("d04 month = " + d04.getMonth());
        System.out.println("d04 monthValue = " + d04.getMonthValue());
        System.out.println("d04 year = " + d04.getYear());
        
        System.out.println("");
        
        System.out.println("d05 hour = " + d05.getHour());
        System.out.println("d05 minutes = " + d05.getMinute());
        System.out.println("d05 seconds = " + d05.getSecond());
    }
}

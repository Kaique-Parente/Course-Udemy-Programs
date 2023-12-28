package application;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program4 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2020-07-15");
        LocalDateTime d05 = LocalDateTime.parse("2020-07-15T17:54:23");
        Instant d06 = Instant.parse("2020-04-30T01:30:32Z");
        
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        
        LocalDate pastWeekDate = d04.minusDays(7);
        LocalDate nextWeekDate = d04.plusDays(7);

        System.out.println("pastWeekDate = " + pastWeekDate);
        System.out.println("nextWeekDate = " + nextWeekDate);
        System.out.println("");
        
        LocalDateTime pastWeekDateTime = d05.minusDays(7);
        LocalDateTime nextWeekDateTime = d05.plusDays(7);
        
        System.out.println("pastWeekDateTime = " + pastWeekDateTime);
        System.out.println("nextWeekDateTime = " + nextWeekDateTime);
        System.out.println("");
        
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant plusWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("plusWeekInstant = " + fm1.format(plusWeekInstant));
        System.out.println("");
        
        Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);
        
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
        
    }
}

package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;
    
    private static DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public int duration (){
        Duration t1 = Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay());
        return (int) t1.toDays(); 
    }
    
    public void updateDates (LocalDate checkin, LocalDate checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }
    
    @Override
    public String toString() {
        return String.format("Room %d, check-in: %s, check-out: %s, %d nights\n", roomNumber, checkin.format(fm1), checkout.format(fm1), duration());
    }
}

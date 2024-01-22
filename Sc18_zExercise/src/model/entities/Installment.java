package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    private LocalDate dueDate;
    private Double value;
    
    DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Installment() {
    }

    public Installment(LocalDate dueDate, Double value) {
        this.dueDate = dueDate;
        this.value = value;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return dueDate.format(fm1) + " - " + String.format("%.2f", value);
    }
}

package com.empreintecarbone;

import java.time.LocalDate;

public class CarbonConsumption {
    private int value;
    private LocalDate StartDate;
    private LocalDate EndDate;

    public int getValue() {
        return value;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

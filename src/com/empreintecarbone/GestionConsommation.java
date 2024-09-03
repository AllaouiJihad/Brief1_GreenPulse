package com.empreintecarbone;

import java.time.LocalDate;

public class GestionConsommation {

    public CarbonConsommation addCarbonConsommation(String id, LocalDate startDate, LocalDate endDate, int value){

         CarbonConsommation carbonConsommation = new CarbonConsommation(value, startDate, endDate);
        return carbonConsommation;
    }
}

package com.company;

import com.company.CalendarLucru;
import com.company.ExceptieZiNelucratoare;

public class Lucrator {
    private String nume;
    CalendarLucru calendar = new CalendarLucru();

    public Lucrator(String nume, CalendarLucru calendar)
    {
        this.nume=nume;
        this.calendar=calendar;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void lucreaza(String zi) throws ExceptieZiNelucratoare
    {
        if(calendar.esteLucratoare(zi))
            System.out.println("Lucratorul "+nume+" lucreaza "+zi);
        else
            throw new ExceptieZiNelucratoare("Lucratorul "+nume+" nu lucreaza "+zi);
    }
}

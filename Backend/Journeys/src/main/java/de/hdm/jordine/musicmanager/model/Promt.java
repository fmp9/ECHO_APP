package de.hdm.jordine.musicmanager.model;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;

public class Promt {
    private String category;
    private LocalDate date;
    private String headline;

    public Promt() {
        // Default-Konstruktor für JSON
    }

    public Promt(String headline, LocalDate date, String category) {
        this.date = date;
        this.category = category;
        this.headline = headline;
    }



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    @Override
    public String toString() {
        return "Promt{" +
                "category='" + category + '\'' +
                ", date=" + date +
                ", headline='" + headline + '\'' +
                '}';
    }
}
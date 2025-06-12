package de.hdm.jordine.musicmanager.model;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;

public class Promt {
    private String text;
    private String category;
    private LocalDate date;
    private String headline;

    public Promt() {
        // Default-Konstruktor für JSON
    }

    public Promt(String text, LocalDate date, String category, String headline) {
        this.text = text;
        this.date = date;
        this.category = category;
        this.headline = headline;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text

    public String getText() {
            return text;
        }

    public void setText(String text) {
            this.text = text;
        }

    public String getHeasline() {
            return headline;
        }

    public void setHeadline(String text) {
            this.headline = headline

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
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

    @Override
    public String toString() {
        return "Promt{" +
                "text='" + text + '\'' +
                ", category='" + category + '\'' +
                ", date=" + date +
                '}';
    }
}
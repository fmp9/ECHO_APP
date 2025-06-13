package de.hdm.jordine.musicmanager.model;

public class JournalEntry {
    private String title; //frage
    private String text; //antwort
    private String Localdate;

    public JournalEntry(String title, String text, String localdate) {
        this.title = title;
        this.text = text;
        Localdate = localdate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLocaldate(String localdate) {
        Localdate = localdate;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getLocaldate() {
        return Localdate;
    }

    @Override
    public String toString() {
        return "JournalEntry{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", Localdate='" + Localdate + '\'' +
                '}';
    }
}
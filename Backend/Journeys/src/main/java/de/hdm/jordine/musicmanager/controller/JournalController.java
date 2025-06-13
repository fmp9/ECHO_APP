package de.hdm.jordine.musicmanager.controller;

import de.hdm.jordine.musicmanager.model.JournalEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JournalController {
    private final List<JournalEntry> journalEntries = new ArrayList<>();

    public List<JournalEntry> getJournalEntries() {
        return journalEntries;
    }

    public void addJournalEntry(JournalEntry journalEntry) {
        journalEntries.add(journalEntry);
    }
}
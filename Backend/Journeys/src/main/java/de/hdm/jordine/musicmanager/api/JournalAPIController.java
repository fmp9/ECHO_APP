package de.hdm.jordine.musicmanager.api;


import de.hdm.jordine.musicmanager.controller.JournalController;
import de.hdm.jordine.musicmanager.controller.PromtController;
import de.hdm.jordine.musicmanager.model.JournalEntry;
import de.hdm.jordine.musicmanager.model.Promt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class JournalAPIController {

    private final JournalController journalController;

    @Autowired
    public JournalAPIController(JournalController promtController) {
        this.journalController = promtController;
    }

    @GetMapping("/entries")
    @ResponseStatus(HttpStatus.OK)
    public List<JournalEntry> getJournalEntries() {
        return journalController.getJournalEntries();
    }

    @PostMapping("/entry")
    @ResponseStatus(HttpStatus.CREATED)
    public void addEntry(@RequestBody JournalEntry entry) {
        journalController.addJournalEntry(entry);
    }


}
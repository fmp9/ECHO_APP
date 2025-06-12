package de.hdm.jordine.musicmanager.controller;

import de.hdm.jordine.musicmanager.model.Promt;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

@Service
public class PromtController {

    private final List<Promt> meineListe = new ArrayList<>();

    public PromtController() {
        // Initialer Prompt
        meineListe.add(new Promt("Think about it", LocalDate.of(2023, 12, 12), "sad"));
    }

    public Promt getRandomPrompt() {
        if (meineListe.isEmpty()) {
            return null; // oder ein default Prompt
        }
        Random rand = new Random();
        return meineListe.get(rand.nextInt(meineListe.size()));
    }

    public void addPrompt(Promt promt) {
        meineListe.add(promt);
    }

    public List<Promt> getAllPrompts() {
        return meineListe;
    }
}
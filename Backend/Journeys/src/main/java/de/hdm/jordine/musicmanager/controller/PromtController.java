package de.hdm.jordine.musicmanager.controller;

import de.hdm.jordine.musicmanager.model.Promt;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

@Service
public class PromtController {

    private final List<Promt> meineListe = new ArrayList<>();

    public class PromptLoader {
        public static void main(String[] args) {}
    }

    public PromtController() {
        meineListe.add(new Promt("What sparked your anger today?", LocalDate.of(2025, 6, 12), "angry"));
        meineListe.add(new Promt("How did your anger influence your actions?", LocalDate.of(2025, 6, 12), "angry"));
        meineListe.add(new Promt("What would you do differently next time?", LocalDate.of(2025, 6, 12), "angry"));
        meineListe.add(new Promt("What’s been weighing on your mind today?", LocalDate.of(2025, 6, 12), "anxious"));
        meineListe.add(new Promt("How did anxiety show up in your body?", LocalDate.of(2025, 6, 12), "anxious"));
        meineListe.add(new Promt("What small thing helped you feel safer today?", LocalDate.of(2025, 6, 12), "anxious"));
        meineListe.add(new Promt("What made you feel peaceful today?", LocalDate.of(2025, 6, 12), "calm"));
        meineListe.add(new Promt("How did you maintain your calm in a stressful moment?", LocalDate.of(2025, 6, 12), "calm"));
        meineListe.add(new Promt("What does inner peace look like for you right now?", LocalDate.of(2025, 6, 12), "calm"));
        meineListe.add(new Promt("What brought you joy today?", LocalDate.of(2025, 6, 12), "happy"));
        meineListe.add(new Promt("Who or what made you smile?", LocalDate.of(2025, 6, 12), "happy"));
        meineListe.add(new Promt("What are you grateful for right now?", LocalDate.of(2025, 6, 12), "happy"));
        meineListe.add(new Promt("What made you feel stretched too thin today?", LocalDate.of(2025, 6, 12), "overwhelmed"));
        meineListe.add(new Promt("What do you need to let go of?", LocalDate.of(2025, 6, 12), "overwhelmed"));
        meineListe.add(new Promt("What would make things feel more manageable?", LocalDate.of(2025, 6, 12), "overwhelmed"));
        meineListe.add(new Promt("What’s been making your heart heavy?", LocalDate.of(2025, 6, 12), "sad"));
        meineListe.add(new Promt("How did you comfort yourself today?", LocalDate.of(2025, 6, 12), "sad"));
        meineListe.add(new Promt("What do you wish someone understood about your sadness?", LocalDate.of(2025, 6, 12), "sad"));
    }
    public List<Promt> getRandomPromptsByCategory(String category) {
        List<Promt> gefiltert = meineListe.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase(category))
                .toList();

        // Liste mischen
        List<Promt> gemischt = new ArrayList<>(gefiltert);
        Collections.shuffle(gemischt);

        // Gib maximal 3 zurück
        return gemischt.subList(0, Math.min(3, gemischt.size()));
    }
    public Promt getRandomPrompt(String category) {
        List<Promt> gefiltert = meineListe;

        if (category != null && !category.isEmpty()) {
            gefiltert = meineListe.stream()
                    .filter(p -> p.getCategory().equalsIgnoreCase(category))
                    .toList();
        }

        if (gefiltert.isEmpty()) {
            return null; // oder ein Default-Prompt
        }

        return gefiltert.get(new Random().nextInt(gefiltert.size()));
    }

    public void addPrompt(Promt promt) {
        meineListe.add(promt);
    }

    public List<Promt> getAllPrompts() {
        return meineListe;
    }
}
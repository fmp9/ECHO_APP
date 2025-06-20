package de.hdm.jordine.musicmanager.api;


import de.hdm.jordine.musicmanager.controller.PromtController;
import de.hdm.jordine.musicmanager.model.Promt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class PromtAPIController {

    private final PromtController promtController;

    @Autowired
    public PromtAPIController(PromtController promtController) {
        this.promtController = promtController;
    }

    @GetMapping("/randomPrompt")
    @ResponseStatus(HttpStatus.OK)
    public Promt getRandomPrompt(@RequestParam(required = false) String category) {
        return promtController.getRandomPrompt(category);
    }

    @PostMapping("/addPrompt")
    @ResponseStatus(HttpStatus.CREATED)
    public void addPrompt(@RequestBody Promt promt) {
        promtController.addPrompt(promt);
    }

}

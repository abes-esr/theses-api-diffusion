package fr.abes.theses.diffusion.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/")
public class DiffusionController {

    @Value("${doc}")
    private String doc;

    @GetMapping(value = "document")
    public String document() {
        return "document : ".concat(doc);
    }
}

package net.tjololo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestSample {
    @GetMapping
    public String sayHello() {
        return "Hello World, I'm built with gradle.";
    }
}

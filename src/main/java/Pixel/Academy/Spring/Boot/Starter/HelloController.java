package Pixel.Academy.Spring.Boot.Starter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/start")
    public String introducere(){
        return "Nume Prenume";
    }
}

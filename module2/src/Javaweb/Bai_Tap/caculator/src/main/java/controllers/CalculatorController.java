package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String calculator(){
        return "index1";
    }
}

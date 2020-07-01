package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String calculate(){
        return "index1";
    }
    @GetMapping("/calculate")
    public String calculator(@RequestParam float number1, @RequestParam float number2, String operand,  ModelMap model){
        switch (operand){
            case "Addition(+)":{
                return number1 + number2;
            }
            case "Subtraction(-)":{
                return number1 - number2;
            }
        }
        return null;
    }
}

package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichCondiment {
    @GetMapping("/save")
    public String save(@RequestParam("condiment") String[] condiment){

    }
}

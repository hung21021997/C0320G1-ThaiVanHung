package controllers;


import javafx.scene.control.CheckBox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;

@Controller
public class SandwichCondiment {
    @GetMapping("/")
    public String sandwich(){
        return "index1";
    }
    @GetMapping("/save")
    public String save(@RequestParam(required = false) String[] condiment, Model model){

        model.addAttribute("condiment",condiment);

        return "index2";
    }
}

package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/converter")
    public String convert(){
        return "indexConvert";
    }
    @GetMapping("/converter/result")
    public String result(@RequestParam String rate, @RequestParam String usd, Model model){
        float result = Float.parseFloat(rate)*Float.parseFloat(usd);
        model.addAttribute("result", result);
        model.addAttribute("rate", rate);
        model.addAttribute("usd", usd);
        return "indexResult";
    }
}

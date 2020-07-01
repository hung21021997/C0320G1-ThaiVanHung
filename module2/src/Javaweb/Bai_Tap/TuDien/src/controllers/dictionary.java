package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class dictionary {
    @GetMapping("/dictionary")
    public String dictionary(){
        return "index1";
    }
    @GetMapping("/dictionary/search")
    public String search(@RequestParam String english, Model model){
        Map<String, String> dic = new HashMap<>();
        dic.put("Hello","Xin chào");
        dic.put("How","Thế nào");
        dic.put("Book","Quyển vở");
        dic.put("Computer","Máy tính");
        String search = dic.get(english);
        if (search!=null){
            model.addAttribute("Result",search);
            model.addAttribute("Word", english);
            model.addAttribute("Message", "Found");
        } else {
            model.addAttribute("Word", english);
            model.addAttribute("Message", "Not Found");
        }
        return "index2";
    }
}

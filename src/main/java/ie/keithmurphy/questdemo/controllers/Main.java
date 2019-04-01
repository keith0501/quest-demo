package ie.keithmurphy.questdemo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Main {


    @GetMapping("/")
    public String mainController(Model model){

    return "home";
    }


}

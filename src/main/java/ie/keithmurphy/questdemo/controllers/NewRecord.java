package ie.keithmurphy.questdemo.controllers;

import ie.keithmurphy.questdemo.beans.RecordBean;
import ie.keithmurphy.questdemo.repo.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class NewRecord implements WebMvcConfigurer {

    @Autowired
    RecordRepository repository;


    @GetMapping("/new-record")
    public String newRecordController(RecordBean bean, Model model){
        model.addAttribute("bean", bean);

        return "new-record";
    }


    @PostMapping("/new-record")
    public String createNewRecordController(@ModelAttribute("bean") RecordBean bean, Model model) {

            boolean failure = false;

            //If the PPS is found notify the user
            if(repository.findByPps(bean.getPps()).size() > 0){
                failure = true;
                model.addAttribute("failure", failure);
                return "new-record";
            }else{

                repository.save(bean);
                return "home";
//        }

            }


    }

}

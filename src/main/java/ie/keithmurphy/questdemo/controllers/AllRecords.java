package ie.keithmurphy.questdemo.controllers;

import ie.keithmurphy.questdemo.beans.RecordBean;
import ie.keithmurphy.questdemo.repo.RecordRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AllRecords {


    @Autowired
    RecordRepository repository;

    private static final Logger log = LoggerFactory.getLogger(AllRecords.class);


    @GetMapping("/all-records")
    public String newRecordController(Model model){

        //Retrieve all the records from the in memory database
        List<RecordBean> beans = new ArrayList<>();

        for (RecordBean record : repository.findAll()) {
            beans.add(record);
        }

        model.addAttribute("beans",beans);

        return "all-records";
    }

}

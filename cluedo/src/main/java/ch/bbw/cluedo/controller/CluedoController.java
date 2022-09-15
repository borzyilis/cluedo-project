package ch.bbw.cluedo.controller;

import ch.bbw.cluedo.models.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CluedoController {

    @Autowired
    DataService dataService;

    @GetMapping("/")
    public String getPersonModel(Model model){
        model.addAttribute("persons", dataService.getPersons());
        model.addAttribute("weapons", dataService.getWeapons());
        return ("play");
    }
}

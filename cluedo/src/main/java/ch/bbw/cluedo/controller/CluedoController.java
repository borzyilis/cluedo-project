package ch.bbw.cluedo.controller;

import ch.bbw.cluedo.logic.GameLogic;
import ch.bbw.cluedo.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CluedoController {

    GameLogic gameLogic = new GameLogic();
    Crime crime = new Crime();
    @Autowired
    DataService dataService;

    @GetMapping("/")
    public String getPersonModel(Model model){
        gameLogic.setupNewGame(dataService, crime);
        model.addAttribute("persons", dataService.getPersons());
        model.addAttribute("weapons", dataService.getWeapons());
        model.addAttribute("rooms", dataService.getRooms());
        model.addAttribute("crime", crime);
        return ("play");
    }

    @PostMapping("/") //This was causing one problem i was getting. I had it as /addexam and it should have been addExam
    public String evaluate(@ModelAttribute("person") Person person, Model model) {

        model.addAttribute("person", person);


        return "play";


    }


}

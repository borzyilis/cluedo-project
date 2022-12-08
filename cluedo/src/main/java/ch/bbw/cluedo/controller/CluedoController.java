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
    int numberOfSugestion = 0;
    Crime crime = new Crime();
    @Autowired
    DataService dataService;

    private  void setup(GameLogic gameLogic){
        gameLogic.setupNewGame(dataService, crime);
    }


    @GetMapping("/")
    public String getPersonModel(Model model){
        setup(gameLogic);
        model.addAttribute("persons", dataService.getPersons());
        model.addAttribute("weapons", dataService.getWeapons());
        model.addAttribute("rooms", dataService.getRooms());
        model.addAttribute("crime", crime);
        return "play";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String evaluate(@RequestParam String ActorId, String WeaponId, String SceneId, Model model) {
        Crime suggestion = new Crime();
        numberOfSugestion++;
        int ActorIdConverted = Integer.parseInt(ActorId);
        int WeaponIdConverted = Integer.parseInt(WeaponId);
        int SceneIdConverted = Integer.parseInt(SceneId);

        model.addAttribute("ActorId", ActorId);
        model.addAttribute("WeaponId", WeaponId);
        model.addAttribute("SceneId", SceneId);
        model.addAttribute("noofsuggestion", numberOfSugestion);

        model.addAttribute("persons", dataService.getPersons());
        model.addAttribute("weapons", dataService.getWeapons());
        model.addAttribute("rooms", dataService.getRooms());
        model.addAttribute("crime", crime);

        suggestion.setActor(ActorIdConverted);
        suggestion.setScene(WeaponIdConverted);
        suggestion.setWeapon(SceneIdConverted);

        if(crime.getHistory().size() > 1 && crime.getHistory().get(crime.getHistory().size() - 1).equals("None Left")){
            setup(gameLogic);
            suggestion = new Crime();
        }

        gameLogic.evaluateSuggestion(suggestion, crime, numberOfSugestion, 10);
        model.addAttribute("status", crime.getHistory().get(crime.getHistory().size() - 1));

        return "play";


    }


}

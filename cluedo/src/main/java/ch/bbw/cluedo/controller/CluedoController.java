package ch.bbw.cluedo.controller;

import ch.bbw.cluedo.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CluedoController {

    List<Person> personList = new ArrayList<>();

    @GetMapping("/")
    public String getPersonModel(Model model){
        personList.add(new Person("Mustard", "Colonel", "Schnauz", 65,"Colonel"));
        personList.add(new Person("Scarlett", "Miss", "rotes Kleid", 45,""));
        model.addAttribute("persons", personList);
        return ("play");
    }
}

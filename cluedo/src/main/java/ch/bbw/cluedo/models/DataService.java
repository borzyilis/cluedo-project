package ch.bbw.cluedo.models;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {
    private List<Person> persons = List.of(
            new Person("Mustard", "Colonel", "Schnauz", 58, "Colonel"),
            new Person("Plum", "Professor", "Brille, Schnauz", 70, "Professor"),
            new Person("Green", "Reverend", "Glatze", 50, "Pfarrer"),
            new Person("Scarlett", "Miss", "Blonde Haare", 40, "-"),
            new Person("White", "Mrs", "graue Haare", 55, "Koch"),
            new Person("Peacock", "Mrs", "graue Haare", 67, "Baroness")
    );

    private List<Waffe> weapons = List.of(
            new Waffe("Schälmesser", "Messer", 100, "Stahl"),
            new Waffe("2mm Kolibri", "Pistole", 15, "Stahl"),
            new Waffe("Granate", "explosive Waffe", 10, "Stahl")
    );

    private List<Room> rooms = List.of(
            new Room("Eingangshalle", 20, 3, 0, "hellbraun", "Karo"),
            new Room("Wintergarten",30, 1, 5, "blau", "Karo"),
            new Room("Wohnzimmer",30, 1, 5, "blau", "Karo")
    );
    
    public List<Person> getPersons() {
        return persons;
    }

    public List<Waffe> getWeapons(){
        return weapons;
    }

    public List<Room> getRooms(){
        return rooms;
    }
}

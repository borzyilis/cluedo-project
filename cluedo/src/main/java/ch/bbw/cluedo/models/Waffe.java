package ch.bbw.cluedo.models;

import java.util.List;

public class Waffe {

    private String name;
    private String typ;
    private int laenge;
    private String material;

    public Waffe(String name, String typ, int laenge, String material) {
        this.name = name;
        this.typ = typ;
        this.laenge = laenge;
        this.material = material;
    }

    public void kill(Person person){
        DataService dataService = new DataService();
        List<Person> personList = dataService.getPersons();
        personList.remove(person);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

package ch.bbw.cluedo.logic;

import ch.bbw.cluedo.models.*;

import java.util.Random;

public class GameLogic {

    private Person crimePerson;
    private Waffe crimeWeapon;
    private Room crimeRoom;

    public void setupNewGame(DataService service, Crime secret) {

        Random randomNumber = new Random();
        secret.setActor(randomNumber.nextInt(1, service.getPersons().toArray().length) - 1);
        secret.setWeapon(randomNumber.nextInt(1, service.getWeapons().toArray().length) - 1);
        secret.setScene(randomNumber.nextInt(1, service.getRooms().toArray().length) - 1);

        this.crimePerson = service.getPersons().get(secret.getActor());
        this.crimeWeapon = service.getWeapons().get(secret.getWeapon());
        this.crimeRoom = service.getRooms().get(secret.getScene());

        System.out.print(secret.getActor() + " " + service.getPersons().indexOf(this.crimePerson));
    }

    public boolean evaluateSuggestion(Crime suggestion, Crime secret, int numberOfSuggestion, int maxNumberOfSuggestions) {

        boolean isActorRight = suggestion.getActor() == secret.getActor();
        boolean isSceneRight = suggestion.getScene() == secret.getScene();
        boolean isWeaponRight = suggestion.getWeapon() == secret.getWeapon();

        if (numberOfSuggestion == maxNumberOfSuggestions) {
            secret.getHistory().add("None Left");
            return false;
        } else if (isSceneRight && isActorRight && isWeaponRight) {
            secret.getHistory().add("Won");
            return true;
        } else if (isActorRight && isSceneRight || isActorRight && isWeaponRight || isSceneRight && isWeaponRight) {
            secret.getHistory().add("2");
            return false;
        } else if (isActorRight || isSceneRight || isWeaponRight) {
            secret.getHistory().add("1");
            return false;
        } else {
            secret.getHistory().add("0");
            return false;
        }

    }
}

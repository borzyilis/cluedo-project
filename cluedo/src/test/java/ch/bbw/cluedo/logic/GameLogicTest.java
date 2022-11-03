package ch.bbw.cluedo.logic;

import ch.bbw.cluedo.models.Crime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLogicTest {

    private GameLogic gameLogic;
    private Crime suggestion;
    private Crime secret;
    private int numberOfSuggestions;
    private int maxNUmberOfSuggestions;

    @BeforeEach
    private void setupBeforeEachTest(){
        gameLogic = new GameLogic();
        suggestion = new Crime();
        secret = new Crime();
    }
    @Test
    void setupNewGame() {
    }

    @Test
    void evaluateSuggestion() {
        numberOfSuggestions = 0;
        maxNUmberOfSuggestions = 9;

        secret.setActor(1);
        secret.setScene(1);
        secret.setWeapon(1);

        suggestion.setActor(1);
        suggestion.setScene(1);
        suggestion.setWeapon(1);

        assertEquals(true, gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestions, maxNUmberOfSuggestions));
        assertEquals("Won", secret.getHistory().get(secret.getHistory().size()-1));
    }

    @Test
    void ActorWeaponSceneNotEqualThenReturnFalseAndHistory0() {
        numberOfSuggestions = 0;
        maxNUmberOfSuggestions = 9;

        secret.setActor(1);
        secret.setScene(1);
        secret.setWeapon(1);

        suggestion.setActor(0);
        suggestion.setScene(0);
        suggestion.setWeapon(0);

        assertEquals(false, gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestions, maxNUmberOfSuggestions));
        assertEquals("0", secret.getHistory().get(secret.getHistory().size()-1));
    }

    @Test
    void OneOfActorWeaponSceneEqualTHenReturnFalseAndHistory1() {
        numberOfSuggestions = 0;
        maxNUmberOfSuggestions = 9;

        secret.setActor(1);
        secret.setScene(7);
        secret.setWeapon(2);

        suggestion.setActor(1);
        suggestion.setScene(0);
        suggestion.setWeapon(0);

        assertEquals(false, gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestions, maxNUmberOfSuggestions));
        assertEquals("1", secret.getHistory().get(secret.getHistory().size()-1));
    }

    @Test
    void TwoOfActorWeaponSceneEqualThenReturnFalseAndHistory2() {
        numberOfSuggestions = 0;
        maxNUmberOfSuggestions = 9;

        secret.setActor(1);
        secret.setScene(1);
        secret.setWeapon(1);

        suggestion.setActor(1);
        suggestion.setScene(1);
        suggestion.setWeapon(0);

        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestions, maxNUmberOfSuggestions));
        assertEquals("2", secret.getHistory().get(secret.getHistory().size()-1));
    }

    @Test
    void AllAreCorrectActorWeaponSceneEqualThenReturnTrueAndHistory3() {
        numberOfSuggestions = 0;
        maxNUmberOfSuggestions = 9;

        secret.setActor(1);
        secret.setScene(1);
        secret.setWeapon(1);

        suggestion.setActor(1);
        suggestion.setScene(1);
        suggestion.setWeapon(1);

        assertEquals(true, gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestions, maxNUmberOfSuggestions));
        assertEquals("Won", secret.getHistory().get(secret.getHistory().size()-1));
    }

    @Test
    void MaxNumberOfSuggestionReachedAndNotWinThenReturnFalseAndHistoryNoneLeft(){
        numberOfSuggestions = 9;
        maxNUmberOfSuggestions = 9;

        secret.setActor(1);
        secret.setScene(1);
        secret.setWeapon(1);

        suggestion.setActor(1);
        suggestion.setScene(1);
        suggestion.setWeapon(1);

        assertEquals(false, gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestions, maxNUmberOfSuggestions));
        assertEquals("None Left", secret.getHistory().get(secret.getHistory().size()-1));
    }
}
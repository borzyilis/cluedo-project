package ch.bbw.cluedo.models;

import java.util.ArrayList;
import java.util.List;

public class Crime {

    private int actor = 0;
    private int weapon = 0;
    private int scene = 0;

    private List<String> history = new ArrayList<>();

    public int getActor() {
        return actor;
    }

    public void setActor(int actor) {
        this.actor = actor;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public int getScene() {
        return scene;
    }

    public void setScene(int scene) {
        this.scene = scene;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Crime other = (Crime) obj;

        if (this.weapon != other.weapon) {
            return false;
        }else if(this.actor != other.actor){
            return false;
        }else if(this.scene != other.scene){
            return false;
        }

        return true;
    }
}

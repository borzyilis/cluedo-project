package ch.bbw.cluedo.models;

import java.util.Date;

public class Person {

    private String name;
    private String anrede;
    private String merkmal;
    private int alter;
    private String beruf;

    public Person(String name, String anrede, String merkmal, int alter, String beruf) {
        this.name = name;
        this.anrede = anrede;
        this.merkmal = merkmal;
        this.alter = alter;
        this.beruf = beruf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public String getMerkmal() {
        return merkmal;
    }

    public void setMerkmal(String merkmal) {
        this.merkmal = merkmal;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getBeruf() {
        return beruf;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    public boolean sterben(Date tag){
        return true;
    }


}

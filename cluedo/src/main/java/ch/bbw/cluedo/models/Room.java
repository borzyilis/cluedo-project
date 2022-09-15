package ch.bbw.cluedo.models;

public class Room {

    private String bezeichnung;
    private int groesse;
    private int anzahlTueren;
    private int anzahlFenster;
    private String tapetenFarbe;
    private String bodenMuster;

    public Room(String bezeichung, int groesse, int anzahlTueren, int anzahlFenster, String tapetenFarbe, String bodenMuster) {
        this.bezeichnung = bezeichung;
        this.groesse = groesse;
        this.anzahlTueren = anzahlTueren;
        this.anzahlFenster = anzahlFenster;
        this.tapetenFarbe = tapetenFarbe;
        this.bodenMuster = bodenMuster;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public int getAnzahlTueren() {
        return anzahlTueren;
    }

    public void setAnzahlTueren(int anzahlTueren) {
        this.anzahlTueren = anzahlTueren;
    }

    public int getAnzahlFenster() {
        return anzahlFenster;
    }

    public void setAnzahlFenster(int anzahlFenster) {
        this.anzahlFenster = anzahlFenster;
    }

    public String getTapetenFarbe() {
        return tapetenFarbe;
    }

    public void setTapetenFarbe(String tapetenFarbe) {
        this.tapetenFarbe = tapetenFarbe;
    }

    public String getBodenMuster() {
        return bodenMuster;
    }

    public void setBodenMuster(String bodenMuster) {
        this.bodenMuster = bodenMuster;
    }
}

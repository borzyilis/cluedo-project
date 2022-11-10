package ch.bbw.cluedo.models;

public class Room {

    private String name;
    private int size;
    private int doors;
    private int windows;
    private String colour;
    private String floor;

    public Room(String name, int size, int doors, int windows, String colour, String floor) {
        this.name = name;
        this.size = size;
        this.doors = doors;
        this.windows = windows;
        this.colour = colour;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
}

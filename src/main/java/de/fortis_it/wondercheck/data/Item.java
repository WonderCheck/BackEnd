package de.fortis_it.wondercheck.data;

/**
 * Created by Robert on 03.04.2017.
 * Data structure for our items
 */

public class Item {

    private String name;
    private boolean state;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}

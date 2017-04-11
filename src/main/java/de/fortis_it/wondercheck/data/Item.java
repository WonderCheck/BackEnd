package de.fortis_it.wondercheck.data;

public class Item {

    /**
     * Data structure for our items
     */

    private int id;
    private String name;
    private boolean state;

    Item( int id, String name, boolean state ) {
        this.id = id;
        this.name = name;
        this.state = state;
    }

    public int getId() { return id; }

    public String getName() {
        return name;
    }
    public void setName( String name ) {
        this.name = name;
    }

    public boolean getState() {
        return state;
    }
    public void setState( boolean state ) {
        this.state = state;
    }
}

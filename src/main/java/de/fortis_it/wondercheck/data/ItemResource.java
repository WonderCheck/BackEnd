package de.fortis_it.wondercheck.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemResouce {

    /**
     * Data structure for our items entity
     */

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private long id;

    private String name;
    private boolean state;

    protected ItemResouce( ){ }

    ItemResouce( String name ) { this.name = name; }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public boolean getState() { return state; }

    public void setState( boolean state ) { this.state = state; }
}

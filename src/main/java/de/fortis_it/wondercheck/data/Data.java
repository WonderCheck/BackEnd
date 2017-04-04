package de.fortis_it.wondercheck.data;

/**
 * Created by Robert on 03.04.2017.
 * Temporary for testing purposes only!
 */

public class Data {
    /**
     * Make array of items
     * @return the items array
     */

    public static Item[] createTestList() {
        Item[] items = new Item[10];
        for (int i = 0; i < 10; i++)
            items[i] = new Item("Item0" + i);
        return items;
    }
}

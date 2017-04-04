package de.fortis_it.wondercheck.data;

/**
 * Created by Robert on 03.04.2017.
 * Temporary for testing purposes only!
 */

public class Data {
    /**
     * Create array of items
     * @return the items array
     */

    public static Item[] createTestList() {
        Item[] list = new Item[10];
        for (int i = 0; i < 10; i++) {
            list[i] = new Item("Item0" + i);
        }
        return list;
    }
}

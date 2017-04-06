package de.fortis_it.wondercheck.data;

/**
 * Created by Robert on 03.04.2017.
 * Temporary for testing purposes only!
 */

import java.util.ArrayList;
import java.util.List;

public class Data {

    /**
     * Create array of items
     * @return the items array
     */

    public static List<Item> createTestList() {

        List<Item> list = new ArrayList<Item>();
        for (int i = 0; i < 10; i++) {
            list.add(new Item("Item0" + i));
        }
        return list;
    }
}

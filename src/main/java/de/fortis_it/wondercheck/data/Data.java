package de.fortis_it.wondercheck.data;

import java.util.ArrayList;
import java.util.List;

public class Data {

    /**
     * Create array of items
     * @return the items array
     */

    public static List<Item> createTestList() {

        List<Item> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Item(i, "Item" + i, false));
        }
        return list;
    }
}

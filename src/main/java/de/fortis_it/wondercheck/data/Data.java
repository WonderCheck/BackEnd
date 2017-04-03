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
    public static Item[] testDataList() {
        Item[] items = new Item[10];
        for (int i = 0; i < 10; i++)
            items[i] = new Item("Item0" + i);
        return items;
    }

    /**
     * Make json string from Item array values
     * @param items array of Item
     * @return json string from Item array values
     */
    public final static String jsonFromDataList(Item[] items) {
        String json = "{";
        for(int i = 0; i < items.length; i++)
            json += "\"name\":\"" + items[i].getName() + "\",\"state\":\"false\"";
        return json + "}";
    }
}

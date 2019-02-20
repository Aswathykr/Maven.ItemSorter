package rocks.zipcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    ArrayList<Item> items;
    public ItemSorter(Item[] items) {
        this.items = new ArrayList<Item>(Arrays.asList(items));
    }

    public Item[] sort(Comparator<Item> comparator) {

        items.sort(comparator);
        return items.toArray(new Item[items.size()]);
    }
}

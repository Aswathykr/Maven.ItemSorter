package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {
    public int compare(Item o1, Item o2) {
        double result = (o1.getPrice() - o2.getPrice());
        int returnValue = result > 0 ? 1: -1;
        if(result == 0)
            returnValue = 0;
        return returnValue;
    }
}

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AddItemsToList {
    // Unit testing for clearing the list

    @Test
    public void addItemToList() {
        List<Integer> list = new ArrayList<>();

        list.add(1);

        // List increased by 1
        assertEquals(1, list.size());

    }

    @Test
    public void addAllItemsToList() {
        List<Integer> list = new ArrayList<>();

        List<Integer> list2 = new ArrayList<Integer>(5);
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);

        list.addAll(list2);

        // List adds another list
        assertEquals(5, list.size());

    }

    @Test
    public void addNullItemToList() {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(null);

        // List increased by 1 with null
        assertEquals(2, list.size());

    }
}

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ItemExists {

    @Test
    public void oneItemExists() {
        List<Integer> list = new ArrayList<>();
        assertEquals(false, list.contains(10));

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // List contains 10
        assertEquals(true, list.contains(10));
    }

    @Test
    public void itemNullExists() {
        List<Integer> list = new ArrayList<>();
        assertEquals(false, list.contains(null));

        list.add(null);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(null);

        // List icontains null
        assertEquals(true, list.contains(null));
    }

    @Test
    public void itemDoesNotExist() {
        List<Integer> list = new ArrayList<>();
        assertEquals(false, list.contains(10));

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // List doesn't contains 10
        assertEquals(false, list.contains(10));
    }
}

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchIndexOfObject {
    @Test
    public void indexOfExistingElement() {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // index of the element 30 = 2
        assertEquals(2 ,list.indexOf(30));
    }

    @Test
    public void indexOfNotExistingElement() {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // index does not exist
        assertEquals(-1 ,list.indexOf(100));
    }

    @Test
    public void indexOfNullElement() {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(null);

        // index of null = 5
        assertEquals(5 ,list.indexOf(null));
    }
}

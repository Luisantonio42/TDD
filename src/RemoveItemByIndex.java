import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveItemByIndex {

    @Test
    public void removeItemByIndex() {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // element 50 was deleted
        assertEquals(50 ,(int)list.remove(4));

        assertEquals(false , list.contains(50));

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void indexDoesNotExist() {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.remove(5);
    }

    @Test(expected = NullPointerException.class)
    public void getSizeOfListNull() {
        List<Integer> list = null;

        // List pointing to a null references
        list.remove(0);
    }
}

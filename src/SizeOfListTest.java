import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SizeOfListTest {
    // Unit testing for list size
    @Test
    public void getSizeOfList() {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // List equal to 4
        assertEquals(4, list.size());
    }

    @Test
    public void getSizeOfListEmpty() {

        List<Integer> list = new ArrayList<>();

        // List with 0 elements
        assertEquals(0, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void getSizeOfListNull() {
        List<Integer> list = null;

        // List pointing to a null references
        list.size();
    }

}

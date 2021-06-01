import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GetElementById {
    @Test(expected = IndexOutOfBoundsException.class)
    public void emptyList() {
        List<Integer> list = new ArrayList<>();

        // List not initialized
        list.get(0);
    }

    @Test
    public void getFirstElement() {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // List at 0 is 10
        assertEquals(10 ,(int) list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void biggerIndexThanSize() {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // index bigger than list size
        list.get(5);
    }
}

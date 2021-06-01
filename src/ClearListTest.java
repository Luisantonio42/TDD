import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ClearListTest {
    // Unit testing for clearing the list

    @Test
    public void clearTheListWithElements() {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.clear();

        // List is empty
        assertEquals(true, list.isEmpty());
    }

    @Test
    public void clearAnEmptyList() {

        List<Integer> list = new ArrayList<>();

        if(list.size()>0){
            list.clear();
        }

        // List is empty
        assertEquals(true, list.isEmpty());
    }

    @Test
    public void clearTheListByReferencing() {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list = new ArrayList<>();

        // List is empty
        assertEquals(true, list.isEmpty());
    }
}

package cs271.lab.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestIterator {

  private List<Integer> list;
  // See the Java List Interface documentation to understand what all the List methods do ...

  @Before
  public void setUp() throws Exception {
    list = new ArrayList<Integer>();
    //list = new LinkedList<>();
    //  Question: Also try with a LinkedList - does it make any difference?
  }

  @After
  public void tearDown() throws Exception {
    list = null;
  }

  @Test
  public void testEmpty() {
    final var i = list.iterator();
    assertFalse(i.hasNext());
  }

  @Test
  public void testNonempty() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    final var i = list.iterator();
    assertTrue(i.hasNext());
    assertEquals(33, i.next().intValue());
    // fix the expected values in the assertions below
    assertTrue(i.hasNext());
    assertEquals(77, i.next().intValue());
    assertTrue(i.hasNext());
    assertEquals(44, i.next().intValue());
    assertTrue(i.hasNext());
    assertEquals(77, i.next().intValue());
    assertTrue(i.hasNext());
    assertEquals(55, i.next().intValue());
    assertTrue(i.hasNext());
    assertEquals(77, i.next().intValue());
    assertTrue(i.hasNext());
    assertEquals(66, i.next().intValue());
    assertFalse(i.hasNext());
  }

  @Test
  public void testRemove() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    final var i = list.iterator();
    while (i.hasNext()) {
      if (i.next() == 77) {
        i.remove(); //  Question: What happens if you use list.remove(Integer.valueOf(77))?

      }
    }
    // using assertEquals and List.of, express which values are left in the list
    // See TestList.java for examples of how to use List.of; also see the Java List
    // interface for more information

      assertEquals(List.of(33, 44, 55, 66), list);
    //fail("Not yet implemented"); // remove this line when done
  }

  @Test
  public void testAverageValues() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
      final var i = list.iterator();
    double sum = 0;
    int n = list.size();

    while(i.hasNext()) {
        sum += i.next().intValue();
    }

    // use an iterator and a while loop to compute the average (mean) of the values
    // (defined as the sum of the items divided by the number of items)
    // testNonempty shows how to use an iterator; use i.hasNext() in the while loop condition
    assertEquals(61.3, sum / n, 0.1);
    assertEquals(7, n);
  }
}

package dchung.pratice;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

import dchung.pratice.myclass.ReverseNumericalOrder;
import dchung.pratice.myclass.Sort;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Sort sortManager = new Sort();
   
    @Test
    public void bubbleSort()
    {
        final int[] numbers = {-3, -5, 1 ,7 ,4, 2};
        final int[] numbers2 = {-3, -5, 1 ,7 ,4, 2};
        final int[] expected = {-5, -3, 1, 2, 4, 7};

        sortManager.bubbleSort(numbers);
        sortManager.bubbleSort2(numbers2);
        assertArrayEquals(expected, numbers);
        assertArrayEquals(expected, numbers2);
    }

    @Test
    public void customSorting()
    {
        final List<Integer> numbers = Arrays.asList(4, 7, 1 ,6 ,3, 5,4);
        final List<Integer> numbers2 = Arrays.asList(4, 7, 1 ,6 ,3, 5,4);
        final List<Integer> expected = Arrays.asList(7,6,5,4,4,3,1);
        final List<Integer> expected2 = Arrays.asList(1,3,4,4,5,6,7);

        Collections.sort(numbers, new ReverseNumericalOrder());
        assertEquals(expected, numbers);
        assertEquals(expected2, sortManager.insertionSort(numbers2));
    }
    /**
     * Sort Object 
     * String class implement Comparable interface, so it can use Arrays.sort
     */
    @Test
    public void sortObjects()
    {
        final String[] strings = {"z","x","y","abc", "zzz","zazzy"};
        final String[] expected = {"abc", "x","y","z","zazzy", "zzz"};

        Arrays.sort(strings);
        assertArrayEquals(expected, strings);
    }
    /**
     * Basic sort
     */
    @Test
    public void sortInts()
    {
        final int[] numbers = {-3, -5, 1 ,7 ,4, 2};
        final int[] expected = {-5, -3, 1, 2, 4, 7};

        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

}

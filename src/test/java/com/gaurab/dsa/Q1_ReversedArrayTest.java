package com.gaurab.dsa;

import org.junit.Test;
import org.mockito.Spy;

import java.util.Arrays;

import static org.junit.Assert.*;


public class Q1_ReversedArrayTest {

    @Spy
    Q1_ReversedArray reversedArray = new Q1_ReversedArray();

    @Test
    public void reverseNumberArray() {
        assertTrue(Arrays.equals(reversedArray.reverseNumberArray(new int[]{1,2,3,4,5}), new int[]{5, 4, 3, 2, 1}));
        assertTrue(Arrays.equals(reversedArray.reverseNumberArray(new int[]{1,2,3,4,5,6}), new int[]{6, 5, 4, 3, 2, 1}));

        assertFalse(Arrays.equals(reversedArray.reverseNumberArray(new int[]{1,2,3,4,5,6}), new int[]{6, 5, 4, 3, 2, 1,0}));
    }

    @Test
    public void reverseStringArray_withRecursion(){
        assertTrue(Arrays.equals(reversedArray.reverseStringArray(new String[]{"1","2","3","4","5"}), new String[]{"5", "4", "3", "2", "1"}));
        assertTrue(Arrays.equals(reversedArray.reverseStringArray(new String[]{"1","2","3","4","5", "6"}), new String[]{"6", "5", "4", "3", "2", "1"}));

        assertFalse(Arrays.equals(reversedArray.reverseStringArray(new String[]{"1","2","3","4","5"}), new String[]{"5", "4", "3", "2", "0"}));
    }
}
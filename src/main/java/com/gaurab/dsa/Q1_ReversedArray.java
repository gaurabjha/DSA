package com.gaurab.dsa;

public class Q1_ReversedArray {

    public int[] reverseNumberArray(int[] arr) {
        int temp, len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
        return arr;
    }

    public String[] reverseStringArray(String[] arr) {
        return reverseNumberArray(arr, 0, arr.length - 1);
    }

    private String[] reverseNumberArray(String[] arr, int START, int END) {
        System.out.println(START + " " + END);
        if (START < END) {
            String temp = arr[START];
            arr[START] = arr[END];
            arr[END] = temp;
            return reverseNumberArray(arr, ++START, --END);
        }
        return arr;
    }
}

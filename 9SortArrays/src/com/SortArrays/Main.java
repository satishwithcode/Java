package com.SortArrays;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Arrays
        // Sort

        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        /* output: 97
                   95
         */
    }
}

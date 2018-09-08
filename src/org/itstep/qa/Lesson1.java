package org.itstep.qa;

import java.util.Arrays;
import java.util.Random;

public class Lesson1 {
    public static void main(String[] args) {
        int array[]; // [] могут стоять и там и там int [] arrey ; int arrey [];
        array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(150);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));
    }
}
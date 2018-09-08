package org.itstep.qa;

import java.util.Arrays;
import java.util.Random;

public class Lesson2 {
    public static void main(String[] args) {
        int array[][]; // [] могут стоять и там и там int [] arrey ; int arrey [];
        array = new int[10][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {//for (int j = 0; j < array[i]/[0]/что угодно .length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i].length; j++) {
               System.out.print(array[i][j] + " ");
           }
        }
        System.out.println();
    }
}
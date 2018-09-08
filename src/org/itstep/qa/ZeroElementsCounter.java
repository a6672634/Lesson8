package org.itstep.qa;

import java.util.Scanner;

public class ZeroElementsCounter {
    public static void main(String[] args) {
        //Напишите программу, выводящую количество нулевых элементов в заданном целочисленном массиве.
        //Массив можно задать любым удобным способом
        int array[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int zeros = 0;
        System.out.println("Введите значение");
        do{
            if(scanner.hasNextInt()){
                array[counter++] = scanner.nextInt();
                if(array[counter - 1] == 0)
                    zeros++;
            }
            else{
                System.out.println("Please try again:");
                scanner.next();
            }
        }while(counter < array.length);
        System.out.println("Count of zeros = " + zeros);
    }
}

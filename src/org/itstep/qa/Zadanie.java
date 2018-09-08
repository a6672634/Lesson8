package org.itstep.qa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Обьявить массив целых чисел длинной 10 элементов
// Ввести значения для элементов массива с клавиатуры, сделать проверку правильности ввода элемента типа Integer,
// если элемент введен неправильно – дать возможность повторить его ввод.
// Вывести массив на экран.
public class Zadanie {
    public static void main(String[] args) {
        int array[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println("Введите значение");
        do{
            if(scanner.hasNextInt()){
                array[counter++] = scanner.nextInt();
            }
            else{
                System.out.println("Please try again:");
                scanner.next();
            }
        }while(counter < array.length);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] +  " ");
        }
        System.out.println();
    }
}

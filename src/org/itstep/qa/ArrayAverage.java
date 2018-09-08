package org.itstep.qa;

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        //Для массива из задачи 1 вычислить среднее арифметическое элементов.
        //Вывести результат на экран.
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

        double average = 0;
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        average = (double)sum / array.length;
        System.out.println("Average = " + average);
    }
}

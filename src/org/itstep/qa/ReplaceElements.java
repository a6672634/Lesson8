package org.itstep.qa;

import java.util.Scanner;

public class ReplaceElements {
    //В массиве из задачи 1 поменять местами первый и последний элементы.
    //Вывести массив на экран до замены и после замены.
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

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

    }
}

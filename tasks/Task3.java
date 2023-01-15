package tasks;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args){
        getElementsMultiplesOfThree();
    }

    /*
    Составить алгоритм: на входе есть числовой массив,
    необходимо вывести элементы массива кратные 3
     */

    public static void getElementsMultiplesOfThree(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int arrayLength = input.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Введите элементы массива (числа):");
        try {
            for (int i = 0; i < arrayLength; i++)
                array[i] = input.nextInt();
            System.out.println("Результат: " + Arrays.toString(Arrays.stream(array).filter(n -> n % 3 == 0).toArray()));
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число, либо слишком большое число! Попробуйте снова :) " + e);
        }
    }
}
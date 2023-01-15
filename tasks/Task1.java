package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args){
        getGreeting();
    }

    /*
    Составить алгоритм: если введенное число больше 7, то вывести “Привет”
     */

    public static void getGreeting(){
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Введите число:");
            int number = input.nextInt();
            String res = number > 7 ? "Привет!" : "Введите другое число.";
            System.out.println(res);
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число, либо слишком большое число! Попробуйте снова :) " + e);
        }
    }
}
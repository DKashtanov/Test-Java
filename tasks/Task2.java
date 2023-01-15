package tasks;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args){
        getName();
    }

    /*
    Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
    если нет, то вывести "Нет такого имени"
     */

    public static void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = input.next();
        if (name.equalsIgnoreCase("Вячеслав"))
            System.out.println("Привет, Вячеслав!");
        else
            System.out.println("Нет такого имени.");
    }
}
package ua.kiev.prog02.ProgKievUaMarathon202003;

/*Написать программу которая считывает 5-и значное
число с клавиатуры и выводит цифры из которого оно состоит*/

import java.util.Scanner;

public class Mar_001145_L02_task03_readNum_03 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Введите 5-ти значное число: ");
        var str = sc.nextLine();
        System.out.println(str.charAt(0) + " " + str.charAt(1) + " " + str.charAt(2) + " " + str.charAt(3) + " " + str.charAt(4));
    }
}

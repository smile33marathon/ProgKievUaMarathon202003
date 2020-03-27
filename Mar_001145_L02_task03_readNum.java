package ua.kiev.prog02.ProgKievUaMarathon202003;

import java.util.Scanner;

public class Mar_001145_L02_task03_readNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var num1 = sc.nextInt();
        System.out.print(num1 / 10000 + " " + (num1 % 10000) / 1000 + " " + (num1 % 1000) / 100 + " " + (num1 % 100) / 10 + " " + num1 % 10);
    }
}

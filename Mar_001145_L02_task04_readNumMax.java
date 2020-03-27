package ua.kiev.prog02.ProgKievUaMarathon202003;

import java.util.Scanner;

public class Mar_001145_L02_task04_readNumMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input num1: ");
        var num1 = sc.nextInt();
        System.out.println("input num2: ");
        var num2 = sc.nextInt();
        System.out.println("input num3: ");
        var num3 = sc.nextInt();
        System.out.println("input num4: ");
        var num4 = sc.nextInt();

        if (num1 > num2) {
        } else {
            num1 = num2;
        }
        if (num1 > num3) {

        } else {
            num1 = num3;
        }
        if (num1 > num4) {
            System.out.println(num1);
        } else {
            System.out.println(num4);
        }
    }
}

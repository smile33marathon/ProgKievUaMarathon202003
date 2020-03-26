package ua.kiev.prog02.ProgKievUaMarathon202003;

import java.util.Scanner;

public class mar_001145_L02_task02_readInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Int:");
        var num1 = sc.nextInt();
        var num2 = sc.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        System.out.println("Input Float:");
        var num3 = sc.nextFloat();
        var num4 = sc.nextFloat();
        System.out.println(num3 + num4);
        System.out.println(num3 - num4);
        System.out.println(num3 * num4);
        System.out.println(num3 / num4);




    }
}

package ua.kiev.prog02.ProgKievUaMarathon202003;

import java.util.Scanner;

public class mar_001145_L02P04_01_Scanner {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        var x = scanner.nextInt();
        System.out.println("Enter y: ");
        var y = scanner.nextInt();
        System.out.println(x);
        System.out.println(y);
        var res = x + y;
        System.out.println("sum (x+y): " + res);
    }
}

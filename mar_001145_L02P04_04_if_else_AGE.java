package ua.kiev.prog02.ProgKievUaMarathon202003;

import java.util.Scanner;

public class mar_001145_L02P04_04_if_else_AGE {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Your age: ");
        var age = sc.nextInt();

        if (age >= 18) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

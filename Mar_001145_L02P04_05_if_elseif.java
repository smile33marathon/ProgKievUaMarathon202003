package ua.kiev.prog02.ProgKievUaMarathon202003;

import java.util.Scanner;

public class Mar_001145_L02P04_05_if_elseif {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Age: ");
        var age = sc.nextInt();

        if (age > 18) {
            System.out.println("Yes 1");
        } else if (age == 18) {
            System.out.println("Yes 2");
        } else {
            System.out.println("No");
        }
    }
}

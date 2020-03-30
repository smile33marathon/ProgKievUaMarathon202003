package ua.kiev.prog02.ProgKievUaMarathon202003;

import java.util.Scanner;

public class mar001145L03Task03Calc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input \"a\": ");
            int a = sc.nextInt();
            System.out.print("Input \"b\": ");
            int b = sc.nextInt();
//            System.out.println("");
            System.out.println("Input math operation [+], [-], [*], [/] or [return] to exit: ");
            System.out.println("op:");
            String op = sc.nextLine();

            if (op.equals("+")) {
                System.out.println("[a] + [b]: " + (a + b));
            } else if (op.equals("-")) {
                System.out.println("[a] - [b]: " + (a - b));
            } else if (op.equals("*")) {
                System.out.println("[a] * [b]: " + (a * b));
            } else if (op.equals("/")) {
                System.out.println("[a] / [b]: " + (a / b));
            } else if (op.equals("")) {
                break;
            }
        }
    }
}
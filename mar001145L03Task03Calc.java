package ua.kiev.prog02.ProgKievUaMarathon202003;

/*Написать простой калькулятор:

а) пользователь вводит число 1
б) пользователь вводит число 2
в) пользователь вводит действие, которое нужно выполнить с числами (+, -, *, /)
г) программа выводит результат и переходит к шагу (а)
д) чтобы программа завершила свою работу нужно ввести пустое значение на шаге (а).
*/

import java.util.Scanner;

public class mar001145L03Task03Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input math operation [+], [-], [*], [/] or [return] to exit: ");
            String op = sc.nextLine();
            System.out.print("Input \"a\": ");
            int a = sc.nextInt();
            System.out.print("Input \"b\": ");
            int b = sc.nextInt();

            if (op.equals("+")) {
                System.out.println("[a] + [b]: " + (a + b));
            } else if (op.equals("-")) {
                System.out.println("[a] - [b]: " + (a - b));
            } else if (op.equals("*")) {
                System.out.println("[a] * [b]: " + (a * b));
            } else if (op.equals("/")) {
                System.out.println("[a] / [b]: " + (a / b));
            } else if (op.equals("")){
                break;
            }
        }
    }
}
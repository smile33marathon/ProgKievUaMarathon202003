package ua.kiev.prog02.ProgKievUaMarathon202003;

/*Вывести на консоль числа от 1 до 100, которые
делятся на 3 без остатка. Например, 3, 6, 9, 12...*/

public class Mar001145L03Task02Div3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

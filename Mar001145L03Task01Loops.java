package ua.kiev.prog02.ProgKievUaMarathon202003;

/*Вывести на консоль числа от 1 до 50 всеми возможными циклами.*/

public class Mar001145L03Task01Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.println("[for]: " + i);
        }
        int j = 1;
        while (j <= 50) {
            System.out.println("[while]: " + j);
            j++;
        }
        int k = 1;
        do {
            System.out.println("[do while]: " + k);
            k++;
        } while (k <= 50);
    }
}

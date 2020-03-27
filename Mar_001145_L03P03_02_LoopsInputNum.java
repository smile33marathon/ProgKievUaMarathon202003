package ua.kiev.prog02.ProgKievUaMarathon202003;

import java.util.Scanner;

public class Mar_001145_L03P03_02_LoopsInputNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int n = 4;

        while (n > 0) {
            int x = sc.nextInt();
            if (x > max) {
                max = x;
                n -= 1;
            }
            System.out.println(n);
        }
        System.out.println(max);
    }
}

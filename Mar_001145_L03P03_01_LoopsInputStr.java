package ua.kiev.prog02.ProgKievUaMarathon202003;

import java.util.Scanner;

public class Mar_001145_L03P03_01_LoopsInputStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i += 1) {
            char c = str.charAt(i);
            System.out.print(c + " ");
        }
    }
}

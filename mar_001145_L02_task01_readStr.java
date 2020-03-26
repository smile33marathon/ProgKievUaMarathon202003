package ua.kiev.prog02.ProgKievUaMarathon202003;

import java.util.Scanner;

public class mar_001145_L02_task01_readStr {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        System.out.println(s1+s2);
        System.out.println(s3+s2+s1);
        System.out.println(s1+s2+s3);
    }
}

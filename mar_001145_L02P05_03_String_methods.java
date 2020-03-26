package ua.kiev.prog02.ProgKievUaMarathon202003;

import java.util.Scanner;

public class mar_001145_L02P05_03_String_methods {
    public static void main(String[] args) {
        String s;
        var sc = new Scanner(System.in);
        System.out.print("input string: ");
        s = sc.nextLine();
        System.out.println(s);
        System.out.println("s.length(): " + s.length());
        System.out.println("s.startsWith(\"ab\"): " + s.startsWith("ab"));
        System.out.println("s.endsWith(\"cd\"): " + s.endsWith("cd"));

        var sub = s.substring(2);// начиная со второго символа
        System.out.println(sub);
        var sub1 = s.substring(1, 3);// [1,3)
        System.out.println(sub1);
        var sub2 = s.charAt(0);// Извлечение символа
        System.out.println(sub2);
    }
}

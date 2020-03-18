package trycatch;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] arg) {
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.printf("Ошибка %s", e.getMessage());
        }
    }
}

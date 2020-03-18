package trycatch;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] arg) {
        try {
            metod();
        } catch (MetodExeption e) {
            System.out.printf("Ты вызываешь ошибку сама)) Полюбуйся - %s\n", e.getMessage());
        } catch (ArithmeticException e) {
            System.out.printf("Не дели на ноль %s\n", e.getMessage());
        } catch (Exception e) {
            System.out.printf("Просто ошибка %s\n", e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }

    static void metod() throws MetodExeption {
        try {
            int a = 5;
            int b = Integer.parseInt("data");
            int c = a / b;
            System.out.println(c);
        } catch (Exception e){
            System.out.println("Error in metod");
            throw new MetodExeption("Ooops");
        }
    }
}

class MetodExeption extends Exception {

    public MetodExeption(String message){
        super(message);
    }
}
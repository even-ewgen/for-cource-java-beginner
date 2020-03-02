package oop.triangle;

import java.util.Scanner;

public class Oop2 {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите стороны треугольника.\nСторона а: ");

        try {
            double a = in.nextDouble();
            System.out.println("Сторона b: ");
            double b = in.nextDouble();
            System.out.println("Сторона c: ");
            double c = in.nextDouble();

            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Проверь свои данные, где-то напортачил.");
            } else {
                Triangle triangle = new Triangle(a, b, c);
                triangle.print();
                System.out.printf("S^2 = %f\n", triangle.area());
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Зачем вводишь всякую гадость?");
            e.printStackTrace();
        }
    }
}

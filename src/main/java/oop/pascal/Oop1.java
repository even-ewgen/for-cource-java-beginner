package oop.pascal;
import java.util.Scanner;

public class Oop1 {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число строк треугольника Паскаля: ");
        int n = in.nextInt();
        //new PascalTriangle().show(n);
        //new PascalTriangle().hardShow(n);
        new PascalTriangle().masterShow(n);
    }
}

import java.util.Scanner;

public class MassDZ2 {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи длину массива: ");
        int x = in.nextInt();
        System.out.println();
        System.out.print("Введи ширину массива: ");
        int y = in.nextInt();
        System.out.println();

        int[][] array = new int[x][y];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = i + j + 1;
        }

        System.out.println("Твой массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.printf("%3d", array[i][j]);
            System.out.println();
        }
    }
}
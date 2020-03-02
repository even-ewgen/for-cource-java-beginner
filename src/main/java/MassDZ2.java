import java.util.Scanner;

public class MassDZ2 {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи длину массива: ");
        int x = in.nextInt();
        System.out.print("Введи ширину массива: ");
        int y = in.nextInt();

        int[][] array = new int[x][y];
        System.out.println("Твой массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 == 0) {
                    if (j == 0) {
                        array[i][j] = i + 1;
                    } else array[i][j] = array[i][j - 1] + (i*2+1);
                } else {
                    array[i][j] = array[i][j - 1] + (array.length*2 - (i*2 + 1));
                }
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}
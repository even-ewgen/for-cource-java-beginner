package str;

import java.util.Scanner;

public class Str5 {

    public static void main(String[] arg) {
        System.out.println("Введи строку для проверки: ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextLine()) {
            String row = in.nextLine();
            if (!row.isEmpty()) {
                System.out.printf("Корооткое слово - %s\n",
                        isMin(row));
            } else {
                System.out.println("Пустота не строка.");
            }
        } else {
            System.out.println("Это не строка.");
        }
    }

    private static String isMin(String row) {
        String[] rows = row.split(" ");
        String min = rows[rows.length-1];
        for (String word : rows) {
            if (word.length() <= min.length()) {
                min = word;
            }
        }
        return min;
    }
}
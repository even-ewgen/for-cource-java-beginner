package str;

import java.util.Scanner;

public class Str2DZ {

    public static void main(String[] arg) {
        System.out.println("Введи строку для проверки: ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextLine()) {
            String row = in.nextLine();
            if (!row.isEmpty()) {
                System.out.printf("Изменено - %s\n",
                        replaseFirstAndLast(row));
            } else {
                System.out.println("Пустота.");
            }
        } else {
            System.out.println("Введена не строка.");
        }
    }

    private static String replaseFirstAndLast(String row) {
        String[] words = row.split(" ");
        row = words[words.length-1];
        words[words.length-1] = words[0];
        for (int i = 1; i < words.length; i++) {
            row = row.concat(String.format(" %s", words[i]));
        }
        return row;
    }
}

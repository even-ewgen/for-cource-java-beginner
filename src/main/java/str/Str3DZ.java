package str;

import java.util.Scanner;

public class Str3DZ {

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
        row = "";
        for (String word : words) {
            if ((word.length() == 1) || (word.toLowerCase().charAt(0) != word.toLowerCase().charAt(word.length() - 1))) {
                row = row.concat(String.format(" %s", word));
            }
        }
        return row;
    }
}

package str;

import java.util.Objects;
import java.util.Scanner;

public class Str1 {

    public static void main(String[] arg) {
        System.out.println("Введи строку для проверки: ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextLine()) {
            String row = in.nextLine();
            //row = "А роза упала на лапу Азора";
            if (!row.isEmpty()) {
                System.out.printf("Это палиндром? %b\n",
                        isPalindrom(row.replaceAll(" ", "").toLowerCase()));
            } else {
                System.out.println("Пустота не палиндром.");
            }
        } else {
            System.out.println("Введена не строка.");
        }
    }

    private static boolean isPalindrom(String row) {
        boolean answert = false;
        for (int i = 0, j = row.length()-1; i <= j; i++, j--) {
            if (row.charAt(i) != row.charAt(j)) {
                answert = false;
                break;
            } else if (i == j) {
                answert = true;
                break;
            }
        }
        return answert;
    }
}
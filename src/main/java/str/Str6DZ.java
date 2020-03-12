package str;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Str6DZ {
    private static String[] vowels = {"у", "е", "ы", "а", "о", "э", "я", "и", "ю", "ё"};

    public static void main(String[] arg) {
        System.out.println("Введи слово: ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextLine()) {
            String wort = in.nextLine();
            //wort = "слог";
            //wort = "слово";
            //wort = "прогноз";
            //wort = "транскрипция";
            wort = "заомагазин";
            if (!wort.isEmpty())
                System.out.printf("Изменено - %s\n", prepareRow(wort));
            else System.out.println("Пустота не слово.");
        } else System.out.println("Это не слово.");
    }

    private static String prepareRow(String wort) {
        int count = 0;
        for (int i = 0; i < wort.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                System.out.println((vowels[j].charAt(0) + " " + wort.charAt(i)));
                if ((vowels[j].charAt(0) == wort.charAt(i)) && (vowels[j].charAt(0) != wort.charAt(i-1))) {
                    count++;
                } else {

                }
            }
        }
        System.out.printf("Число слогов: %d\n", count);
        if (count == 0 || count == 1) {
            return wort;
        } else {
            String temp = "";

            wort = "";
            return wort;
        }
    }
}

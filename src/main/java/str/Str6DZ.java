package str;

import java.util.Scanner;

public class Str6DZ {
    private static String[] pat = {"у", "е", "ы", "а", "о", "э", "я", "и", "ю", "ё"};

    public static void main(String[] arg) {
        System.out.println("Введи слово: ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextLine()) {
            String wort = in.nextLine();
            //wort = "слог";
            wort = "слово";
            //wort = "прогноз";
            //wort = "транскрипция";
            //wort = "зоомагазин";
            if (!wort.isEmpty())
                System.out.printf("Изменено - %s\n", prepareRow(wort));
            else System.out.println("Пустота не слово.");
        } else System.out.println("Это не слово.");
    }

    private static String prepareRow(String wort) {
        for() {

        }
        wort = "";
        return wort;
    }
}

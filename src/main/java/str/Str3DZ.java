package str;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Str3DZ {

    public static void main(String[] arg) {
        System.out.println("Введи строку для проверки: ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextLine()) {
            String row = in.nextLine();
            //row = "Dskvjo. Dkosjv? Dfejfo Deofpjo joepfw. Dksokijopiej! Dskjofo Dksopdjj ji jid? Dksokijopiej! Dsjvopsoejej joej jj oe!";
            if (!row.isEmpty()) {
                System.out.printf("Изменено - %s\n",
                        removeEmotions(row));
            } else {
                System.out.println("Пустота.");
            }
        } else {
            System.out.println("Введена не строка.");
        }
    }

    private static String removeEmotions(String row) {
        Pattern pattern = Pattern.compile("(.*?[\\.\\?\\!])");
        Matcher matcher = pattern.matcher(row);
        row = "";
        while (matcher.find()) {
            if (!matcher.group().contains("!")) row = row.concat(String.format("%s", matcher.group()));
        }
        return row;
    }
}

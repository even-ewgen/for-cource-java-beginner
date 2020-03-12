package str.reg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Pattern pattern = Pattern.compile("\\+7\\(\\d{3}\\)\\d{3}(-\\d{2}){2}");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            System.out.printf("Введен номер: %s\n", matcher.group());
        } else {
            System.out.println("Не то.");
        }
    }
}
import java.util.Scanner;

public class Mass2 {
    public static void main(String[] arg) {
        String[] animals = {"Крыса", "Корова", "Тигр", "Заяц", "Дракон", "Змея", "Лошадь", "Овца", "Обзьяна", "Петух",
                            "Собака", "Свинья"};
        String[] colors = {"Зеленый", "Красный", "Жетый", "Белый", "Черный"};

        Scanner scan = new Scanner(System.in);
        System.out.print("Год: ");
        int n = scan.nextInt();

        System.out.println(colors[((n-4))%10/2] + " " + animals[(n-4)%12]);
    }
}
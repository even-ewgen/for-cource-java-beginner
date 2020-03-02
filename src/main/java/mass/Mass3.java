package mass;

import java.util.Random;

public class Mass3 {
    public static void main(String[] arg) {
        int[] mass = new int[20];
        System.out.println(mass.length);
        for (int i = 0; i < mass.length; i++) {
            boolean work = true;
            int n = 0;
            while (work) {
                n = new Random().nextInt(21);
                for (int j = 0; j < mass.length; j++) {
                    if (mass[j] == n) {
                        break;
                    } else if (j == mass.length - 1) {
                        work = false;
                    }
                }
            }
            mass[i] = n;
            System.out.println(i + " " + mass[i]);
        }
    }
}
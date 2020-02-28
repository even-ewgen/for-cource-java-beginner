import java.util.Random;

public class MassDZ1 {

    public static void main(String[] arg) {
        int[] year = new int[365];
        int[] counts = new int[8];
        String[] vectors = {"северный", "южный", "восточный", "западный", "северо-западный", "северо-восточный", "юго-западный", "юго-восточный"};
        Random rnd = new Random();
        for (int i = 0; i < year.length; i++) {
            year[i] = rnd.nextInt(8) + 1;
            switch (year[i]) {
                case 1: counts[0]++; break;
                case 2: counts[1]++; break;
                case 3: counts[2]++; break;
                case 4: counts[3]++; break;
                case 5: counts[4]++; break;
                case 6: counts[5]++; break;
                case 7: counts[6]++; break;
                case 8: counts[7]++; break;
            }
        }
        int min = 365;
        int vector = 0;

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] < min) {
                min = counts[i];
                vector = i + 1;
            }
        }

        System.out.printf("Для строительства более всего подойдет %s участок.", vectors[vector]);
    }
}

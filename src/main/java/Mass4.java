import java.util.Arrays;
import java.util.Random;

public class Mass4 {
    public static void main(String[] arg) {
        int[] array = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i += array[i] != 0?1:0) {
            array[i] = (int) ((20) * rnd.nextDouble() - 10);
        }
        System.out.println(Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i]*array[i+1] < 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
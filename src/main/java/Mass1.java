import java.util.Arrays;
import java.util.Random;

public class Mass1 {

    public static void main(String[] arg) {
        String[] suits = {"\u2660", "\u2665", "\u2663", "\u2666"};
        String[] vals = {"6","7","8","9","10","В","Д","К","Т"};
        String[] col = new String[suits.length*vals.length];
        int count = 0;
        for(String str : suits) {
            for(String val : vals) {
                col[count++] = str + val;
            }
        }

        System.out.println(Arrays.toString(col));

        Random rnd = new Random();
        for (int i = 0; i < col.length*2; i++) {
            int k = rnd.nextInt(col.length);
            int l = rnd.nextInt(col.length);
            String temp = col[k];
            col[k] = col[l];
            col[l] = temp;
        }
        System.out.println(Arrays.toString(col));
    }
}

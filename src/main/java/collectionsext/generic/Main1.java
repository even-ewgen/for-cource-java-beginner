package collectionsext.generic;

import java.util.ArrayList;

public class Main1 {

    public static void main(String[] arg) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);

        int s = 0;
        for(int i = 0; i < list.size(); i++) {
            s += list.get(i);
        }
    }
}
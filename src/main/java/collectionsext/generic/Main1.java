package collectionsext.generic;

import java.util.ArrayList;

public class Main1 {

    public static void main(String[] arg) {
        ArrayList list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add("fife");

        int s = 0;
        for(int i = 0; i < list.size(); i++) {
            s += (int) list.get(i);
        }
    }
}
package oop.pascal;

import java.util.Arrays;

public class PascalTriangle {
    private static int[] array = {1};

    public static void show(int n) {
        System.out.printf("%4d\n", array[0]);
        do {
            int[] box = array;
            array = new int[box.length + 1];
            for (int i = 0; i < array.length; i++) {
                if ((i == 0) || (i == array.length - 1)) array[i] = 1;
                else array[i] = box[i] + box[i - 1];
                System.out.printf("%4d", array[i]);
            }
            System.out.println();
        } while (array.length <= n);
    }

    public static int[] hardShow(int n) {
        if (array.length == n) {
            System.out.println(Arrays.toString(array));
            return array;
        } else {
            System.out.println(Arrays.toString(array));
            int[] box = array;
            array = new int[box.length + 1];
            for (int i = 0; i < array.length; i++) {
                if ((i == 0) || (i == array.length - 1)) array[i] = 1;
                else array[i] = box[i] + box[i - 1];
            }
            return hardShow(n);
        }
    }
}
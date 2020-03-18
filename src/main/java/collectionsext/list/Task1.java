package collectionsext.list;

import java.util.*;

public class Task1 {

    public static void main(String[] arg) {
        System.out.println("Введите N: ");
        Scanner in = new Scanner(System.in);
        int n = 0;
        if (in.hasNextInt()) {
            n = in.nextInt();
            Integer[] mas = new Integer[n];
            Random rnd = new Random();
            for (int i = 0; i < mas.length; i++) {
                mas[i] = rnd.nextInt(10);
            }
            System.out.println(Arrays.toString(mas));

            List<Integer> list = new ArrayList<>(Arrays.asList(mas));
            System.out.println(list);

            Collections.sort(list);
            System.out.println(list);

            list.sort(new ComparatorInt<>());
            System.out.println(list);

            Collections.shuffle(list);
            System.out.println(list);

            Collections.rotate(list, 1);
            System.out.println(list);

            List<Integer> copyList = new ArrayList(list);
            for (int i = 0; i < list.size(); i++) {
/*                boolean is = false;
                for (int j = 0; j < list.size(); j++) {
                    if(i != j && list.get(i).equals(list.get(j))) {
                        list.remove(j);
                        is = true;
                    }
                }
                if (is) list.remove(i);*/
                while (list.contains(list.get(i))) {
                    list.remove(list.get(i));
                }
            }
            System.out.println(list);

            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < copyList.size(); j++) {
                    if(copyList.get(j).equals(list.get(i))) {
                        copyList.remove(j);
                    }
                }
            }
            System.out.println(copyList);

            Integer[] newMas = new Integer[copyList.size()];
            copyList.toArray(newMas);
        }
    }

    static class ComparatorInt<T> implements Comparator<T> {
        public int compare(T a, T b) {
            return (int) b - (int) a;
        }
    }
}

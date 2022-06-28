package Book.Java_util.CollectionFramework;

import java.util.*;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> ob1 = new ArrayList<>();
        ob1.add("A");
        ob1.add("B");
        ob1.add("C");
        ob1.add("D");
        System.out.println(ob1);
        ob1.add(1, "QQQ");
        System.out.println(ob1);
        ob1.remove(1);
        System.out.println(ob1);

        ArrayList<Integer> ob2 = new ArrayList<>();
        ob2.add(1);
        ob2.add(2);
        ob2.add(3);

        Integer[] arr = new Integer[ob2.size()];

        arr = ob2.toArray(arr);
        int sum=0;
        for (Integer x : ob2) sum += x;
        System.out.println(sum);
    }
}

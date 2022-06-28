package Book.Java_util.CollectionFramework;

import java.util.*;
public class CompatorDemo3 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("sfdsf");
        ll.add("make");
        ll.add("jodf");
        ll.add("vddf");
        ll.add("dfdfdddddddddddddddd");
        TreeSet<String> ss = new TreeSet<String>();
        ss.add("eeeeee");
        ss.add("fd");
        System.out.print("Before --> ");
        for (String x : ll) System.out.print(x + " ");
        System.out.println();

        Comparator<Integer> c = Collections.reverseOrder();

        System.out.print("After --> ");
        for (String x : ll) System.out.print(x + " ");
        System.out.println();

        Collections.shuffle(ll);
        System.out.print("After method shuffle() --> ");
        for (String x : ll) System.out.print(x + " ");
        System.out.println();
        System.out.println("Min --> " + Collections.min(ss));
        System.out.println("Max --> " + Collections.max(ll));


    }
}

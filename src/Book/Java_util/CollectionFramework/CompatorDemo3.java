package Book.Java_util.CollectionFramework;

import java.util.*;
public class CompatorDemo3 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(3);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(15);

        System.out.print("Before --> ");
        for (int x : ll) System.out.print(x + " ");
        System.out.println();

        Comparator<Integer> c = Collections.reverseOrder();
        Collections.sort(ll, c);

        System.out.print("After --> ");
        for (int x : ll) System.out.print(x + " ");
        System.out.println();

        Collections.shuffle(ll);
        System.out.print("After method shuffle() --> ");
        for (int x : ll) System.out.print(x + " ");
        System.out.println();
        System.out.println("Min --> " + Collections.min(ll));
        System.out.println("Max --> " + Collections.max(ll));


    }
}

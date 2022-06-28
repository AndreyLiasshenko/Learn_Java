package Book.Java_util.CollectionFramework;
import java.util.*;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<String> ob = new TreeSet<>();
        ob.add("Mark");
        ob.add("Karl");
        ob.add("A");
        ob.add("B");
        ob.add("D");
        ob.add("T");
        System.out.println(ob);
        System.out.println(ob.subSet("A", "T"));
        System.out.println(ob.ceiling("A"));
        System.out.println(ob.pollFirst());
        System.out.println(ob.pollLast());
        System.out.println(ob);
    }
}

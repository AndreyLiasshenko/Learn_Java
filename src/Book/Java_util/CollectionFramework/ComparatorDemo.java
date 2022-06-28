package Book.Java_util.CollectionFramework;
import java.util.*;

public class ComparatorDemo implements Comparator<String> {
    public int compare(String strA, String strB) {
        return strA.compareTo(strB);
    }
}

class CDemo {
    public static void main(String[] args) {
        ComparatorDemo comp = new ComparatorDemo();
        TreeSet<String> ob = new TreeSet<>((strA, strB) -> strA.compareTo(strB));
        ob.add("A");
        ob.add("C");
        ob.add("D");
        ob.add("F");
        ob.add("W");

        for (String x : ob) {
            System.out.println(x);
        }

    }
}



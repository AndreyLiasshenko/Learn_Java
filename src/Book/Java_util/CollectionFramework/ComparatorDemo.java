package Book.Java_util.CollectionFramework;
import java.util.*;

public class ComparatorDemo implements Comparator<String> {
    public int compare(String a, String b) {
        String strA, strB;
        strA = a;
        strB = b;
        return strA.compareTo(strB);
    }
}

class CDemo {
    public static void main(String[] args) {
        TreeSet<String> ob = new TreeSet<>(new ComparatorDemo());
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



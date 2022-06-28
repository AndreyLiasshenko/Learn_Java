package Book.Java_util.CollectionFramework;
import java.util.*;

public class ComparatorDemo implements Comparator<String> {
    public int compare(String a, String b) {
        String strA, strB;
        strA = a;
        strB = b;
        return strB.compareTo(strA);
    }
}



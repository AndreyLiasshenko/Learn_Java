package Book.Java_util.CollectionFramework;
import java.util.*;

class ComparatorD implements Comparator<String> {
    public int compare(String strA, String strB) {
        int i,j,k;
        i = strA.lastIndexOf(' ');
        j = strB.lastIndexOf(' ');
        k = strA.substring(i).compareTo(strB.substring(j));
        if (k==0) {
            return strA.compareTo(strB);
        } else {
            return k;
        }

    }
}


public class ComparatorDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> set = new TreeMap<String, Double>(new ComparatorD());
        set.put("Karolina Ralf", 323.32);
        set.put("Maria Quine", 5444.54);
        set.put("Mark Lon", 44443.33);
        set.put("NoName G", 450.00);
        set.put("W W", 434.34);
        set.put("A A", 444.44);

        Set<Map.Entry<String, Double>> getSet = set.entrySet();

        for (Map.Entry<String, Double> m : getSet) {
            System.out.println(m.getKey() + ": " + m.getValue());
        }
    }
}

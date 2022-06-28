package Book.Java_util.CollectionFramework;
import java.util.*;


public class CollectionsWithForEach {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(1);
        ob.add(2);
        ob.add(3);
        ob.add(4);
        int sum=0;
        for(Integer x : ob) sum +=x;
        System.out.println(sum);
    }
}

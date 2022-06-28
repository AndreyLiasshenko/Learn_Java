package Book.Java_util.CollectionFramework;
import java.util.*;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> ob = new ArrayList<>();
        ob.add(1.0);
        ob.add(2.0);
        ob.add(3.0);
        ob.add(4.0);
        ob.add(5.0);

        Spliterator<Double> split = ob.spliterator();
        System.out.println("State elements before changes");
        while(split.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        ArrayList<Double> sqrts = new ArrayList<>();
        split = ob.spliterator();
        while(split.tryAdvance((n) -> sqrts.add(Math.sqrt(n))));

        split = sqrts.spliterator();
        System.out.println("State elements after changes");
        split.forEachRemaining((n) -> System.out.println(n));
    }
}

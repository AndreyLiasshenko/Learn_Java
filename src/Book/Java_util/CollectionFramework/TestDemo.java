package Book.Java_util.CollectionFramework;
import java.util.*;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<>();
        ob.add("A");
        ob.add("B");
        ob.add("C");
        ob.add("D");
        ob.add("E");
        ob.add("F");

        Iterator<String> itr = ob.iterator();
        System.out.print("Collection in begin : ");
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        ListIterator<String> listIter = ob.listIterator();
        while(listIter.hasNext()) {
            String element = listIter.next();
            listIter.set(element + "++");
        }

        System.out.print("Collection with change : ");
        itr = ob.iterator();
        while(itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Collection reverse : ");
        while(listIter.hasPrevious()) {
            String element = listIter.previous();
            System.out.print(element + " ");
        }

    }
}

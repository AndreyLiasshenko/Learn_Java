package Book.Java_util.CollectionFramework;
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ob = new LinkedList<>();
        ob.add("A");
        ob.add("B");
        ob.add("C");
        ob.addFirst("Q");
        ob.addLast("P");
        System.out.println(ob);

        ob.removeLast();
        System.out.println(ob.peekFirst());
        System.out.println(ob);
        System.out.println(ob.pollFirst());
        ob.push("d");
        System.out.println(ob.pop());
        System.out.println(ob);

    }
}

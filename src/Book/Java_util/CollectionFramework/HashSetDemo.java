package Book.Java_util.CollectionFramework;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> ob = new HashSet<>();
        ob.add("One");
        ob.add("Two");
        ob.add("Three");
        ob.add("Plate");
        ob.add("Sofa");
        System.out.println(ob);
        System.out.println(ob.contains("Sofa"));
    }
}

package Book.Java_util.CollectionFramework;

import java.util.*;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties test = new Properties();
        test.put("Tom", "Filed");
        test.put("Mark", "Stone");
        test.put("Lisa", "Green");
        Set<?> s = test.keySet();
        for (Object name : s) {
            System.out.println(test.getProperty((String) name));
        }
        System.out.println(test.getProperty("test", "not found"));
    }
}

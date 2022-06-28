package Book.Java_util.CollectionFramework;

import java.util.*;
import java.util.function.BiConsumer;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> ob = new HashMap<String, Double>();
        ob.put("Kate Snow", 21009.45);
        ob.put("Bob Stone", 456.00);
        ob.put("Alise Dirt", 69020.40);

        Set<Map.Entry<String, Double>> set = ob.entrySet();
        ob.put("Kate Snow", 300.4);

        String str = "Hello i'm so happy to see you";
        String d = "";
        if (d == null | d == "") System.out.println("null");
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String q = arr[i].charAt(0) + "";
            arr[i] = arr[i].replace(q, q.toUpperCase());
        }
        StringBuffer sb = new StringBuffer();
        for (String x : arr) {
        }
        }
    }

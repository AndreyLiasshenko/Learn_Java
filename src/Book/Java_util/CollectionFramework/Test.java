package Book.Java_util.CollectionFramework;

import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"aaa", "bbbbb", "cccccccc"};
        int max = 8;
        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i]);
            for (int j = 0; j < (max - arr[i].length()); j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

    }
}

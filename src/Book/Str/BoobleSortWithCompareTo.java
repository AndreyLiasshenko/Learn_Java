package Book.Str;

import java.util.Arrays;

public class BoobleSortWithCompareTo {
    public static void main(String[] args) {
        String[] array = {"Now","is", "the", "time", "for", "all", "good" , "men" ,
        "to" , "соmе", "to" , "the", "aid" , "of", "their" , "country"};

        for (int j =0; j< array.length; j++) {
            for (int i = j+1; i<array.length; i++) {
                if (array[i].compareTo(array[j]) < 0) {
                    String t = array[j];
                    array[j] = array[i];
                    array[i] = t;
                }
            }
            System.out.println(array[j]);
        }
    }
}

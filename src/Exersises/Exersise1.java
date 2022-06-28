package Exersises;

import java.util.ArrayList;
import java.util.Arrays;

//Удалить в массиве все числа, которые повторяются более двух раз.
public class Exersise1 {
    public static void main(String[] args) {
        int[] array = {1, 51, 45, 3, 2, 1, 5, 1, 6, 5, 51};

        ArrayList<Integer> arrayList = new ArrayList<>();

        out:for (int i=0; i< array.length; i++) {
            for (int j=1; j< array.length; j++) {
                if (array[i] == array[j]) break out;
            }
            arrayList.add(array[i]);
        }
        for(int s : arrayList) {
            System.out.println(s);
        }
    }
}

package AlgoritmsAndDataStructures;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;
        long mem[] = new long[n+1];
        Arrays.fill(mem, -1);
        System.out.println(naiveFib(n, mem));
    }


    private static long effectiveFib(int n) {
        long[] array = new long[n+1];

        array[0] = 0;
        array[1] = 1;

        for (int i =2; i<=n; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array[n];
    }


    private static long naiveFib(int n, long[] mem) {
        if (mem[n] != -1) return mem[n];
        if (n <=1) return n;
        long result = naiveFib(n-1, mem) + naiveFib(n-2, mem);
        mem[n] = result;
        return result;


    }
}

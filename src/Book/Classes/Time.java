package Book.Classes;

public class Time {
    public static void main(String[] args) {
        long start, stop;
        start = System.currentTimeMillis();
        long[] array = new long[1000000];
        for (int i=0; i<1000000L; i++) {
            array[i] = i * i;
        }
        stop = System.currentTimeMillis();
        System.out.println(stop - start);
    }
}

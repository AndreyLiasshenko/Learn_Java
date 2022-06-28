package Book.Classes;

public class TimeNano {
    public static void main(String[] args) {
        long startNano, stopNano;

        startNano = System.nanoTime();
        long[] arr = new long[10];
        for (int i =0; i<10L; i++) {
        }
        stopNano = System.nanoTime();
        System.out.println(stopNano - startNano);
    }
}

package Book.Classes;

public class RuntimeDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer[] array = new Integer[1000];
        mem1 = r.totalMemory();
        System.out.println("Total memory: " + mem1);
        mem1 = r.freeMemory();
        System.out.println("Free memory: " + mem1);
        r.gc(); // збір сміття
        mem1 = r.freeMemory();
        System.out.println("Free memory after clean: " + mem1);

        for (int i =0; i<1000; i++) {
            array[i] = i;
        }

        mem2 = r.freeMemory();
        System.out.println("Free memory after memory allocation: " + mem2);
        System.out.println("Memory that was used: " + (mem1 - mem2));

        for (int i =0; i<1000; i++) array[i] = null;
        r.gc();

        mem2 = r.freeMemory();
        System.out.println("free memory after clean : " + mem2);


        mem2 = r.freeMemory();
    }
}

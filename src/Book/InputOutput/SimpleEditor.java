package Book.InputOutput;
import java.io.*;

public class SimpleEditor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[100];
        for (int i =0; i<100; i++) {
            array[i] = br.readLine();
            if (array[i].equals("stop")) break;
        }
        System.out.println("\nYour file contains:");
        for (int i = 0; i<100; i++) {
            if (array[i].equals("stop")) break;
            System.out.println(array[i]);
        }
    }
}

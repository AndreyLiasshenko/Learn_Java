package Book.InputOutput;
import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        int i;

        if (args.length != 2) {
            System.out.println("Использование: откуда куда");
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e2) {
                System.out.println("Error closing first file");
            }

            try {
                if (fout != null) fout.close();
            } catch (IOException e2) {
                System.out.println("Error closing second file");
            }
        }


    }
}

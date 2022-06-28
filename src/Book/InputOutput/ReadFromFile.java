package Book.InputOutput;
import java.io.*;

public class ReadFromFile {
    public static void main(String[] args) {
        FileInputStream file = null;
        int i;
        if (args.length != 1) {
            System.out.println("Use: ReadFromFile name_file");
            return;
        }
        try {
            file = new FileInputStream(args[0]);

            do {
                i = file.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);

        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            try {
                if (file != null) file.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}

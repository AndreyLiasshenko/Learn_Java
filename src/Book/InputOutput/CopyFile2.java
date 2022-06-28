package Book.InputOutput;
import java.io.*;

public class CopyFile2 {
    public static void main(String[] args) {
        int i;

        if (args.length != 2) {
            System.out.println("Use: CopyFile2 file1 file2");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0]);   // try with resources (ARM)
             FileOutputStream fos = new FileOutputStream(args[1])) {

            do {
                i = fin.read();
                if (i != -1) fos.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

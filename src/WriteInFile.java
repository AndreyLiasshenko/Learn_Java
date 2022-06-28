import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteInFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test");
        PrintWriter pw = new PrintWriter(file);


        StringBuilder empty = new StringBuilder("                    ");
        for (int i=1; i<20; i++) {
            pw.println(empty.toString() +i);
            empty.deleteCharAt(-0);
        }

        StringBuilder empty2 = new StringBuilder("                   ");
        for (int i=1; i<20; i++) {
            pw.println(empty.toString() +i);
            empty.append(" ");
        }
        pw.close();
    }
}

package Book.InputOutput;
import java.io.*;

public class Input {
//    public static void main(String[] args) throws IOException {
//        char c;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Press 'q' for quit");
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//        } while (c != 'q');
//    }

    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press 'stop' for quit");
        do {
            str =  br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}

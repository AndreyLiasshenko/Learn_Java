package Book.Classes;
import java.io.*;
import java.util.Arrays;

public class ParseNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int i= 0;
        StringBuffer sb = new StringBuffer();
        do {

            try {
                s = br.readLine();
                i = Integer.parseInt(s);
                sb.append(i);
            } catch (NumberFormatException e) {
                System.out.println("Format is incorrect");
            }
        } while (i != -1);

        System.out.println(sb);
    }
}

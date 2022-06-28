package Book.ExeptionsHandling;
import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int n, b,c;
        Random r = new Random();

        for (int i =0;i< 3000; i++) {
            try {
                n= r.nextInt();
                b = r.nextInt();
                c = 1234 / (b/n);
            } catch (ArithmeticException e) {
                System.out.println("division by 0");
                c = 0;
                System.out.println("c = "+c);
            }
        }
    }
}

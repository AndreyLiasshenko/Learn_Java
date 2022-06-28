package Book;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class StaticImport {
    public static void main(String[] args) {
        double n1, n2;
        double hypot;

        n1 = 2;
        n2 = 5;
        hypot = sqrt(pow(n1, 2)) + sqrt(pow(n2, 2));
        System.out.println(hypot);
    }
}

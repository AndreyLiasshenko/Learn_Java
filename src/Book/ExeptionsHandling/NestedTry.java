package Book.ExeptionsHandling;

public class NestedTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 10 / a;
            System.out.println("a = "+a);

            try {
                if (a == 1) a = a / (a-a);

                if (a == 2) {
                    int[] c = { 2};
                    c[59] = 44;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error index");
            }
        } catch (ArithmeticException e) {
            System.out.println("sf");
        }
    }
}

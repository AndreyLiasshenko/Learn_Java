package Book.ExeptionsHandling;

public class MultipleCatchException {
    public static void main(String[] args) {
        int[] array = {1, 2 ,3};
        try {
            double a = 3 / 4;
            array[20] = 5;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception is catched:" + e);
        }
    }
}

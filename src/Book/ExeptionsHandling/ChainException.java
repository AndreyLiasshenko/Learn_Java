package Book.ExeptionsHandling;

public class ChainException {

    static void probable() {

        NullPointerException e = new NullPointerException("up level");

        e.initCause(new ArithmeticException("Reason"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            probable();
        } catch (NullPointerException e ) {
            System.out.println("Exception " + e + " intercepted");

            System.out.println(e.getCause());
        }

    }
}

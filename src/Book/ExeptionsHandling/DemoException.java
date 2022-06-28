package Book.ExeptionsHandling;

class OwnSubClassException extends Exception {
    private int detail;

    OwnSubClassException(int a) {
        detail = a;
    }

    public String toString() {
        return "Exeption [ "+ detail+ " ]";
    }
}

class DemoException {

    static void compute(int a) throws OwnSubClassException {

        System.out.println("Method compute is calling( "+ a +" )");
        if (a > 10) {
            throw new OwnSubClassException(a);
        }
        System.out.println("Normal completion");
    }

    public static void main(String[] args) {
        try {
            compute(3);
            compute(12);
        } catch (OwnSubClassException e) {
            System.out.println("Exception was catched: " + e);
        }
    }
}


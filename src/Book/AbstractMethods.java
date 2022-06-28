package Book;

abstract class AbstractMethods {
    abstract void callMe();

    void showMessage() {
     System.out.println("Hello");
    }
}

class B extends AbstractMethods {

    void callMe() {
        System.out.println("I'm method callMe, nice to meet you)");
    }
}

class Test_{
    public static void main(String[] args) {
        B b = new B();
        b.callMe();
        b.showMessage();
    }
}
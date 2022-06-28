package Book.Inheritance;

class FinalMethod {

    FinalMethod(int a, int b) {
        System.out.println(a * b);
    }

    final void meth() {
        System.out.println("I'm final");
    }
}

class Bfinal extends FinalMethod{

    Bfinal(int a, int b){
        super(a,b);
    }

//    void meth() {
//        System.out.println();      Error! meth is final in class FinalMethod
//    }
}

class TestFinal {
    public static void main(String[] args) {
        Bfinal b = new Bfinal(3, 4);
        b.meth();
    }
}

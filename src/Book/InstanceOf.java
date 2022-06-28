package Book;

class A {
    int i;
    int j;
}

class W {
    int i;
    int j;
}

class C extends A {
    int k;
}

class V extends W {
    int k;
}

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        W w = new W();
        C c = new C();
        V v = new V();
        if (a instanceof A) System.out.println("a ->> A");
        if (w instanceof W) System.out.println("w --> W");
        if (c instanceof C)System.out.println("c --> C");
        if (c instanceof A) System.out.println("c --> A");
    }
}


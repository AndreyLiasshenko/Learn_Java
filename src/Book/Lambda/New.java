package Book.Lambda;

interface T {
    String operation(String n);
}

public class New {

    static void show(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        T t;
        t = (n) -> {return n +  " ---- TEST";};
        show(t.operation("FX"));
    }
}

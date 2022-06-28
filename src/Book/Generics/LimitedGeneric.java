package Book.Generics;

public class LimitedGeneric<T extends Number> {
    T n1;
    T n2;

    LimitedGeneric(T n1, T n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    Double myltiply() {
        return n1.doubleValue() * n2.doubleValue();
    }

    public static void main(String[] args) {
        LimitedGeneric<Integer> ob = new LimitedGeneric<Integer>(4,4);
        System.out.println(ob.myltiply());
    }
}

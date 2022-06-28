package Book.Generics;

public class TwoGen<T, V> {
    T field1;
    V field2;

    TwoGen(T field1, V field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    T getField1() {
        return field1;
    }

    V getField2() {
        return field2;
    }

    public static void main(String[] args) {
        TwoGen<Integer, String> ob = new TwoGen<Integer, String>(21, "Tomas");
        System.out.println(ob.getField1());
        System.out.println(ob.getField2());
    }
}

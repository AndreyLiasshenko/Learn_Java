package Book.Generics;

public class Compare {

    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] v) {
        for (int i = 0; i<v.length; i++) {
            if (v[i].equals(x)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1 , 3, 3, 4, 2, 4,22, 4};
        String str[] = {"one", "two", "three"};

        System.out.println(isIn(3, nums));
        System.out.println(isIn("one", str));
    }
}

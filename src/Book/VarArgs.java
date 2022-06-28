package Book;

public class VarArgs {
    static void operation(int... v) {
        for (int x : v)
            System.out.println(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        operation(1,2,3);
        operation(10);
    }
}

package Book;

public class UseStatic {
    static int num;
    static int b;

    static void calculate(int num1, int num2) {
        System.out.println(num1 * num2 + " " + b);
    }

    static {
        b = 2 * 2;
    }


}

class TestStatic {
    public static void main(String[] args) {
        UseStatic.calculate(1,4);
    }
}
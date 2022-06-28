import java.util.Arrays;
import java.util.Scanner;

class Operation {
    public void plus(int n1, int n2) {
        System.out.println(n1 + n1);
    }
    public void subtract(int n1, int n2) {
        System.out.println(n1 - n2);
    }

    public void multiply(int n1, int n2) {
        System.out.println(n1 * n1);
    }
    public void divide(int n1, int n2) {
        System.out.println(n1 / n2);
    }

    public int[] arr(int[] array) {
        for (int q : array) {
            array[q] = 2;
        }
        return array;
    }



    public void hello(int x) {
        if (x % 2 ==0) {
            System.out.println("divisible by 2");
        } else {
            System.out.println("not divisible by 2");
        }
    }
}


public class Func {
    public static void main(String[] args) {
        Operation op = new Operation();
        op.plus(4, 3);
        op.divide(4,3);
        op.multiply(4,3);
        op.divide(4,3);
        int[] array = new int[10];
        System.out.println(Arrays.toString(op.arr(array)));
        op.hello(10);

        System.out.println("Hello i have brilliant offer!");
        System.out.println("T-shirt for 5.50$!");
        System.out.println("Tell me how many you ready to buy");
        Scanner scanner = new Scanner(System.in);
        double howMany = scanner.nextDouble();
    }

}

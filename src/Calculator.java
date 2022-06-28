import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operation (+ - * / %)");
        String op = scanner.nextLine();
        int  n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.print(1+" "+op+" "+n2+" = ");
        System.out.println(calculate(n1, n2, op));
    }
    static int calculate(int n1, int n2, String op) {
        String[] arr = {"+", "-", "*", "/", "%"};
        for (String x : arr) {
            if (x.equals("+")) return n1 + n2;
            else if (x.equals("-")) return n1 - n2;
            else if (x.equals("/")) return n1 / n2;
            else if (x.equals("*")) return n1 * n2;
            else if (x.equals("%")) return n1 % n2;
        }
        return 0;
    }
}



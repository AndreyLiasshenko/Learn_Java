package Classes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value: ");
        double first = scanner.nextDouble();
        System.out.println("Enter second value: ");
        double second = scanner.nextDouble();

        if (first < 0 | first > 1000 | second < 0 | second > 1000) {
            System.out.println("Value isn't correct");
            return;
        }

        double result = Math.sqrt(((first * first) + (second * second)));
        String formattedDResult = new DecimalFormat("#0.00").format(result);
        System.out.println("Your result: " + formattedDResult);
    }

}

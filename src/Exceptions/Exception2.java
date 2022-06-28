package Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) throws ScannerException{
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = scanner.nextInt();
            if (x !=0) {
                try {
                    throw new ScannerException("User enter not 0");
                } catch (ScannerException e) {
                    System.out.println("User enter not 0");
                }
            }
        }
    }
}

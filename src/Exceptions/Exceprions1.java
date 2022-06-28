package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Exceprions1 {
    public static final String ANSI_RESET = "\u001B[0m"; // color for console
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        try {
            readFromFile();
        } catch (FileNotFoundException e) {
            System.out.println(ANSI_RED + "File not found" + ANSI_RESET);
        }
    }
    public static void readFromFile() throws FileNotFoundException{
        File file = new File("test");
        Scanner scanner = new Scanner(file);
    }
}

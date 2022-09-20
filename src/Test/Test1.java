package Test;


import java.io.IOException;

class ReadingTest {
    public static void main(String[] args) {
        int r = 0;
        try {
            r = System.in.read();
        } catch (IOException e) {

        }
        System.out.println((char) r);
    }
}

package Book.Str;

import java.util.Arrays;

public class DemoSubString {
    public static void main(String[] args) {
        String demo = "String";
        System.out.println(demo.substring(3));
        System.out.println(demo.substring(2, 4));
        System.out.println("hello".replace('h', 'v'));
        System.out.println("   Hello World    ".trim());
        double d = 45.3;
        String demoS = String.join(" ", "Mark", "Emilia", "Jane");
        System.out.println(demoS);

        StringBuffer buffer = new StringBuffer("Hi");
        buffer.ensureCapacity(20);
        System.out.println("///////// String Buffer ///////////  name , length, capacity");
        System.out.println(buffer + "\n" + buffer.length() + "\n" + buffer.capacity());

        StringBuffer show = new StringBuffer("London is a capital of great Britain");
        System.out.println(show);
        show.setLength(19);
        System.out.println(show);


        char[] chars = new char[20];
        show.getChars(0, 6, chars, 0);
        show.getChars(12, 19, chars, 7);
        System.out.println(Arrays.toString(chars));

        StringBuffer show2 =new StringBuffer("I see you");
        show2.replace(2, 5, "love");
        System.out.println(show2);
        System.out.println(show2.substring(7));
        System.out.println(show2.substring(2,6));

    }
}

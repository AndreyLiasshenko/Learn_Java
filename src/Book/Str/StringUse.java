package Book.Str;

import java.util.Arrays;

class BoxDemo {
    int width;
    int height;
    int depth;

    BoxDemo(int a, int b, int c) {
        width = a;
        height = b;
        depth = c;
    }

    @Override
    public String toString() {
        return "w = "+ width + "\nh = "+ height + "\nd = " + depth;
    }
}


public class StringUse {
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String show = new String(chars);
        String show2 = "Hi";
        System.out.println(show);
        System.out.println("ggg".length());

        BoxDemo b = new BoxDemo(2,4,10);
        System.out.println(b);


        String s = "Demonstration";
        char[] buffer = new char[4];
        s.getChars(0, 4, buffer, 0);
        System.out.println(buffer);
        char[] d = s.toCharArray();
        System.out.println(Arrays.toString(d));
        System.out.println(s.endsWith("o"));

        System.out.println(Runtime.getRuntime());
        System.out.println(Runtime.getRuntime().freeMemory());
    }
}

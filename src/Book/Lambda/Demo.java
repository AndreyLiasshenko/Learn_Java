package Book.Lambda;

import java.beans.IntrospectionException;
import java.util.Locale;

interface TestNum<T> {
    T getValue(T t);
}

interface TestStr {
    String getStr(String n);
}

interface DemoParametr {
    int getNum(int n);
}

interface Test2 {
    int getnum2(int a, int b);
}
public class Demo {
    public static void main(String[] args) {
        DemoParametr parametr;
        parametr = (n) -> n * 2;

        System.out.println(parametr.getNum(4));
        System.out.println(parametr.getNum(12));

        Test2 test2;
        Test2 test3;
        test2 = (int a, int b) -> a * b;
        test3 = (a, b) -> a / b;

        TestStr str;
        str = (n) -> {
            String s = "";
            for (int i =n.length()-1; i>=0; i--) {
                s += n.charAt(i);
            }
            return s;
        };

        System.out.println(str.getStr("Hello"));

        TestNum<Integer> t1 = (n) -> n * 5;
        TestNum<String> t2 = (n) -> n.toUpperCase();
        System.out.println(t1.getValue(5));
        System.out.println(t2.getValue("hello"));


    }

}

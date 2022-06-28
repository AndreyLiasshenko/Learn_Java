package Book.Lambda;

interface Test {
    String func(String n);
}

public class LambdaAsArgument {


    static String strOp(Test t, String s) {
        return t.func(s);
    }

    public static void main(String[] args) {
        String str1 = "Lambda expression makes Java more effective";
        String str2 = "Hello";

        System.out.println(strOp( (t) -> {
            String s ="";
            for (int i=0; i< t.length(); i++) {
                if (t.charAt(i) != ' ') {
                    s += t.charAt(i);
                }
            }
            return s;
        }, str1));

        Test reverse = (str) -> {
            String s = "";
            for (int i =str.length()-1; i>=0; i--) {
                s += str.charAt(i);
            }
            return s;
        };

        System.out.println(strOp(reverse, str2));
    }
}

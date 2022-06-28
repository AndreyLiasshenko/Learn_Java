package Book.Lambda;

interface StringFunk {
    String func(String n);
}

class MethodLink {
    static String reverse(String n) {
        String result = "";
        for (int i= n.length()-1; i>=0; i--) {
            result += n.charAt(i);
        }
        return result;
    }
}

class DemoFunk {
    static String strOp(StringFunk sf, String n) {
        return sf.func(n);
    }


    public static void main(String[] args) {
        String s1 = "This is string";
        String outstr;
        outstr = strOp(MethodLink::reverse, s1);
        System.out.println(outstr);
    }
}

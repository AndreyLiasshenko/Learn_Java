package Book.Java_util;

public class Test {
    public String toJadenCase(String phrase) {
        if (phrase == null) return null;
        if (phrase.equals("")) return null;
        String[] arr = phrase.split(" ");
        String returnString = "";
        for (String x : arr) {
            String begin, end;
            begin = x.charAt(0) + "";
            end =  x.substring(1, x.length());
            phrase = begin.toUpperCase() + end;
            returnString = returnString + phrase + " ";
        }
        return returnString;
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.toJadenCase("<Most Trees Are Blue[ ]>"));
        System.out.println(test.toJadenCase(null));
        System.out.println(test.toJadenCase(""));
    }
}

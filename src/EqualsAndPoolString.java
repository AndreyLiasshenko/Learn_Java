public class EqualsAndPoolString {
    public static void main(String[] args) {
        String string1 = "Hi";
        String string2 = "Hi";                    // PollString
        System.out.println(string1 == string2);


        String string3 =  new String("hello");
        String string4 = new String("hello");
        System.out.println(string3 == string4);       // PollString already is not work
        System.out.println(string3.equals(string4));
    }
}

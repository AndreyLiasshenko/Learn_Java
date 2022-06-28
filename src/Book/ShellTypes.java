package Book;

public class ShellTypes {

    static int m(Integer i) {
        return i;
    }

    public static void main(String[] args) {
        Integer i = 44; // Автоупаковка
        System.out.println(i.doubleValue());
        int x = i; // Автораспаковка
        System.out.println(x);
        Character c = 'h';
        Boolean bool = true;
        System.out.println(bool.booleanValue());
        Integer ob = m(100);
        System.out.println(ob);
    }
}

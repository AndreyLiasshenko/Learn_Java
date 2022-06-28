package Book.Generics;

public class Account<T> {
    private T id;
    private int sum;


    Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    T getId() {
        return id;
    }

    int getSum() {
        return sum;
    }

    public static void main(String[] args) {
        Account<String> ob1 = new Account<String>("Person1", 30090);
        Account<Character> ob2 = new Account<Character>('P', 5);
        System.out.println(ob1.getId() + " " + ob1.getSum());
        System.out.println(ob2.getId()+ " " + ob2.getSum());
    }
}

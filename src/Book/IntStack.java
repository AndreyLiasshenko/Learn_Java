package Book;

public interface IntStack {
    void push(int item);
    int pop();

    default void clear() {
        System.out.println("This method doesn't implemented");
    }
}

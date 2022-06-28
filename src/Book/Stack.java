package Book;

public class Stack {
    int[] stck = new int[10];
    int tos;
    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full!");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos< 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stck[tos--];
        }
    }

    public static void main(String[] args) {
        Stack stck = new Stack();
        stck.push(1);
        stck.push(2);
        System.out.println(stck.pop());
        System.out.println(stck.pop());
    }
}

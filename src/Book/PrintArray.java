package Book;

public class PrintArray {
    int [] array;
    PrintArray(int i) {
        array = new int[i];
    }

    void ShowArray(int i) {

        if (i == 0) return;
        else ShowArray(i-1);
        System.out.println("[" + (i-1) + "]" + array[i-1]);
    }
}

class TestArray {
    public static void main(String[] args) {
        PrintArray arr = new PrintArray(10);
        for (int i =0; i<10; i++) arr.array[i] = i;

        arr.ShowArray(5);
    }
}

package Book;

import Book.Interface.DefaultMethod;

class Box {
    double width;
    double height;
    double depth;

    int nameMethod(int n1, int n2) {
        return n1 + n2;
    }

    void nameMethod2(int n1, int n2) {
        System.out.println(n1 + n2 + " Method 2");
    }

}


public class Classes_ {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.height = 12;
        box1.width = 14;
        double v = box1.nameMethod(1,3);
        System.out.println(box1.nameMethod(1,4) + " Method 1");
        box1.nameMethod2(1, 6);

        int test = DefaultMethod.getDefaultNumber();///// This is a default method in the interface DefaultMethod /////
        System.out.println(test);
    }
}

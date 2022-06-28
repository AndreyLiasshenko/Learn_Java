package Book.Interface;

import java.util.Random;

public class User implements Inter {
    int number= 32;
    public void Show()  {
        System.out.println("Class User");
    }

    void hello() {
        System.out.println("sd");
    }
}

class AnotherUser implements Inter {
    public  void Show() {
        System.out.println("Class AnotherUser");
    }
}


class Test2 implements DefaultMethod {
    public static void main(String[] args) {
        Inter i = new User();
        AnotherUser au = new AnotherUser();
        i.Show();
        i = au;
        i.Show();

        Test2 t = new Test2();
        System.out.println(t.getNumber());
        System.out.println(t.getString());
    }


    public int getNumber() {
        return 10;
    }
}


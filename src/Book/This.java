package Book;

class This {
    int a;
    int b;

    This(int n1 ,int n2 ) {
        a = n1;
        b = n2;
    }

    This (int n1) {
        this(n1, n1);
    }

    This() {
        this(0);
    }
}

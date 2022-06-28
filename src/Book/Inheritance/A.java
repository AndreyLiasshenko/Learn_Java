package Book.Inheritance;

class A {
    private int i;
    private int j;
    void showIJ (){
        System.out.println("i = "+i+", j = "+j);
    }
    A(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class B extends A{
    int n = 100;
    void showN(){
        System.out.println("n = "+n);
    }

    B (int i, int j, int n) {
        super(i, j);
        this.n = n;
    }
}

class simpleInheritance{
    public static void main(String[] args) {
        B subObj = new B(30, 40, 1);
        subObj.showIJ();
    }
}
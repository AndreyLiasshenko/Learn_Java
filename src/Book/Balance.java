package Book;

class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal<0)
        System.out.println("--->");
        System.out.println(name + ": $" + bal);
    }
}

class AccountBalance {
    public static void main(String[] args) {
        Balance[] curent = new Balance[3];

        curent[0] = new Balance("Tom", 123.50);
        curent[1] = new Balance("Mark", 1642.50);
        curent[2] = new Balance("Alan ", 433.0);

        for ( int i =0; i<3; i++) curent[i].show();


    }
}
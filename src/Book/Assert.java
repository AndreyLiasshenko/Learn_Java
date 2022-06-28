package Book;

class Assert {
    static int i = 3;

    static int getNum() {
        return i--;
    }


    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getNum();
            assert n >0: "n > 0!";
            System.out.println(n);
        }
    }
}
package Book.Generics;

class TwoC {
    int x;
    int y;

    TwoC(int a, int b) {
        x = a;
        y= b;
    }
}

class ThreeC extends TwoC{
    int z;
    ThreeC(int x , int y, int z) {
        super(x, y);
        this.z = z;
    }
}

class FourC extends ThreeC{
    int t;

    FourC(int x, int y, int z, int t) {
        super(x,y,z);
        this.t = t;
    }
}

class Coords<T extends TwoC> {
    T[] coords;

    Coords(T[] o) {coords = o;}
}

class TestC {
    static void showXY(Coords<?> c) {
        System.out.println("Coords X Y");
        for (int i = 0; i< c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeC> c) {
        for (int i =0; i<c.coords.length; i++) {
            System.out.println("Coords X Y Z");
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoC[] tc = {new TwoC(3,4), new TwoC(12, 5), new TwoC(64, 32), new TwoC(0,0)};
        Coords<TwoC> obj = new Coords<TwoC>(tc);
        showXY(obj);
    }
}
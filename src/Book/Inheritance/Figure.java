package Book.Inheritance;

abstract class Figure {
    double n1;
    double n2;

    Figure(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Area rectangle is ");
        return n1 * n2;
    }
}

class Triangule extends Figure {
    Triangule(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Area triangule is ");
        return n1 * n2 / 2;
    }
}

class Test{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,6);
        Triangule t = new Triangule(7, 3);
        Figure figref;

        figref = r;
        System.out.println(figref.area());

        figref = t;
        System.out.println(figref.area());
    }
}
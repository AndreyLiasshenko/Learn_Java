package Book.Generics;

public class Demo<T> {
    T field;
    Demo(T field) {
        this.field = field;
    }

    void getType (){
        System.out.println(field.getClass().getName());
    }

    T getOb (){
        return field;
    }

    public static void main(String[] args) {
        Demo<Integer> ob = new Demo<Integer>(2);
        ob.getType();
        System.out.println(ob.getOb());

    }
}

package Book.Annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;


//  Повторяемая аннотация
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnno.class)
@interface MyAnno {
    String str() default "Test";
    int val() default 5;
}


// контейнерная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnno{
    MyAnno[] value();
}
class RepeatedAnno {
    @MyAnno(str="first", val = 1)
    @MyAnno(str="second", val = 2)
    public static void myMeth(String str, int i) {
        RepeatedAnno ob = new RepeatedAnno();

        try{
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            Annotation[] an = m.getAnnotationsByType(MyAnno.class); // Method getAnnotationByType in use
            for (Annotation a : an) System.out.println(a);
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}

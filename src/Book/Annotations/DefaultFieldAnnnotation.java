package Book.Annotations;


import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnDef{
    String str() default "Testing";
}


public class DefaultFieldAnnnotation {

    @MyAnnDef()
    public static void method() {
        DefaultFieldAnnnotation ob = new DefaultFieldAnnnotation();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("method");
            MyAnnDef anno = m.getAnnotation(MyAnnDef.class);
            System.out.println(anno.str());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        method();
    }
}

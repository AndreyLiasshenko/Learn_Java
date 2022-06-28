package Book.Annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnn{
    String str();
    int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}


@What(description = "Annotation of class")
@MyAnn(str = "class", val = 12)
class Meta {
    @What(description = "Annotation of method")
    @MyAnn(str = "Method", val = 120)
    public static void meth() {
        Meta ob = new Meta();

        try {
            Annotation annot[] = ob.getClass().getAnnotations();
            System.out.println("All annotation from class");
            for (Annotation x : annot) {
                System.out.println(x);
            }
            System.out.println();

            Method m = ob.getClass().getMethod("meth");
            System.out.println("All annotation from method");
            annot = m.getAnnotations();
            for (Annotation x : annot) {
                System.out.println(x);
            }

        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        meth();
    }
}


package Book.Annotations;


import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface OMAnnotation{ int value();}


class OneMemberAnnotation {

    @OMAnnotation(10)
    public static void meth() {
        OneMemberAnnotation ob = new OneMemberAnnotation();

        try {
            Method m = ob.getClass().getMethod("meth");
            OMAnnotation a = m.getAnnotation(OMAnnotation.class);
            System.out.println(a.value());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        meth();
    }
}

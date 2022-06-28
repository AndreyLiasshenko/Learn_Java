package Book.Annotations;
import Book.MultithreadedProgramming.A;

import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface Marker{  }

class AnnotationsMarkers {

    @Marker
    public static void meth() {
        AnnotationsMarkers ob = new AnnotationsMarkers();

        try {
            Method m = ob.getClass().getMethod("meth");
            System.out.println(m.isAnnotationPresent(Marker.class));
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        meth();
    }
}

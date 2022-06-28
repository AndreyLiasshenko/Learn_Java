package TypesNestedClasses;

public class Electrocar {
    public int id;

    public Electrocar(int id) {
        this.id = id;
    }

    public class Motor {

        //Вложеный нестатический класс
        public void startMotor() {
            System.out.println("Motor" + id +" car's is stated");
        }
        public void stopMotor() {
            System.out.println("Motor" + id+" car's was stoped");
        }
    }

    // Вложеный статический класс
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int i=1;

        class SomeClass {
            public void SomeMethod() {
                System.out.println("Some method..");
                System.out.println(i);
            }
            final int importantNumber = 18;

        }

        SomeClass someClass = new SomeClass();
        test(someClass.importantNumber);
    }

    private void test(Object obj) {
        System.out.println(obj);
    }
}

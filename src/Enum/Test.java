package Enum;


public class Test {
    public static void main(String[] args) {
        Animals animal = Animals.CAT;

        switch (animal) {
            case CAT:
                System.out.println("It's a Cat");
                break;
            case FROG:
                System.out.println("It's a Frog");
        }
    }
}


package Book.Lambda;

interface AvArray {
    double func(double[] n) throws NoElementsInArrayException;
}

class NoElementsInArrayException extends Exception {
    NoElementsInArrayException() {
        super("Array is empty");
    }
}

public class AverageArr {
    public static void main(String[] args) throws NoElementsInArrayException {
        double values[] = {1.4, 5.6, 4.3, 53.22, 43.4,23.23,};

        AvArray array = (n) -> {
            if (n.length == 0)  throw new NoElementsInArrayException();
            double average=0;
            for (int i =0; i<n.length; i++) {
                average += n[i];
            }
            return  average / n.length;
        };
        System.out.println(array.func(values));
    }
}

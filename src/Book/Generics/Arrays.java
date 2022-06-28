package Book.Generics;

public class Arrays<T extends Number>{
    T[] array;
    Arrays (T[] o) {
        array = o;
    }

    double average() {
        double sum = 0;

        for (T x : array) {
            sum += x.doubleValue();
        }
        return sum / array.length;
    }

    boolean sameArr(Arrays<?> o) {
        if (average() == o.average()) return true;
        else return false;
    }

    public static void main(String[] args) {
        Integer numsInt[] = {1, 2, 3, 4, 5, 6, 7, 8,9};
        Arrays<Integer> ob1 = new Arrays<Integer>(numsInt);
        System.out.println("Average is (Int) "+ ob1.average());

        Double numsDouble[] = {1.3, 2.4, 6.4, 5.6, 4.2};
        Arrays<Double> ob2 = new Arrays<Double>(numsDouble);
        System.out.println("Average is (Double) " + ob2.average());

        System.out.println(ob1.sameArr(ob2));
    }
}

package Book.Lambda;
import java.util.function.Function;

public class ImportInterface {
    public static void main(String[] args) {
        Function<Integer, Integer> func = (n) -> {
            int result =1;
            for (int i =1; i<n; i++) {
                result += i * result;
            }
            return result;
        };

        System.out.println(func.apply(5));
    }
}

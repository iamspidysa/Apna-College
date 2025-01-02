package Java8Feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEachTelusko {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4, 5, 7, 8, 3, 1);
        // Consumer<Integer> cs = new Consumer<Integer>() {

        // public void accept(Integer t) {
        // System.out.println(t);
        // }

        // };
        // arr.forEach(cs);

        // all this converted to this , by help of lambda expression.
        arr.forEach(cs -> System.out.println(cs));
    }
}

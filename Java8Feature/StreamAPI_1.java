package Java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI_1 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4, 5, 7, 8, 3, 1);
        /*
         * 
         * Stream<Integer> s = arr.stream();
         * //s.forEach(n -> System.out.println(n)); //Cannot use a stream variable
         * TWICE.
         * Stream<Integer> s1 = s.sorted();
         * Stream<Integer> s2 = s1.filter(n -> n%2==0);
         * int s3 = (int) s2.count();
         * System.out.println(s3);
         * 
         */

        // tHIS WHOLE CODE CAN BE SHORTEND LIKE THIS

        int s4 = (int) arr.stream() // int s4 is final data type, copied the ArrayList to stream. (int) typecasted
                                    // because u cant print a object.
                .sorted() // sorted the array into ascending.
                .filter(n -> n % 2 == 0) // took odd values out of the stream.
                .count(); // COunted how much element are there in the stream.
        System.out.println(s4);
    }

}

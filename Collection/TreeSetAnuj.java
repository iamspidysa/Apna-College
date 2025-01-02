package Collection;

import java.util.TreeSet;

public class TreeSetAnuj {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(50);
        ts.add(1000);
        ts.add(00);
        ts.add(12);
        // ts.add(null);  //Doesnot stores null values
        for (Integer integer : ts) {
            System.out.println(integer);
        }
        System.out.println(ts.tailSet(10));
    }
}

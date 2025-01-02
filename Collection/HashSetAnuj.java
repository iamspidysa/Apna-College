package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetAnuj {
    // LinkedHashSet and Hashset Both are learned here
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(); // Stores Unique and Random values in set.
        hs.add(10);
        hs.add(24);
        hs.add(1);
        hs.add(5);
        hs.add(24);
        hs.add(null);
        System.out.println(hs);
        System.out.println(hs.contains(1));

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(); // stores unique and Maintains insertion order of the
                                                            // elements, meaning the order in which elements were added
                                                            // is preserved.
        lhs.add(10);
        lhs.add(24);
        lhs.add(1);
        lhs.add(5);
        lhs.add(24);
        lhs.add(null);
        System.out.println(lhs);

    }
}

package Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapAnuj {
    public static void main(String[] args) {
        Map<Integer, String> mp = new TreeMap<>();
        mp.put(20, "Saurabh");
        mp.put(42230, "Kumar");
        mp.put(60, "Anand");
        mp.put(3280, "Saurabh");
        System.out.println(mp);
        System.out.println(mp.keySet());
    }
}

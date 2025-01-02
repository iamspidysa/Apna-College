package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapAnuj {
    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<>();
        hm.put("Saurabh", 20);
        hm.put("Kumar", 40);
        hm.put("Anand", 60);
        hm.put("Saurabh", 80);
        System.out.println(hm);
        System.out.println(hm.get("Saurabh"));
        System.out.println(hm.containsKey("Anand"));
        hm.remove("Saurabh");
        System.out.println(hm);
        hm.putIfAbsent("Hello", 123);
        hm.putIfAbsent("Hello", 234);
        System.out.println(hm);


    }
}

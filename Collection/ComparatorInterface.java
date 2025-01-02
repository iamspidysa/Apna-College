package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorInterface {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if((i%10)>(j%10))
                return 1;
                else
                return -1;
            }
            
        };

        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(29);
        arrL.add(32);
        arrL.add(94);
        arrL.add(47);
        arrL.add(20);
        Collections.sort(arrL, com);
        System.out.println(arrL);


        //Question - Sort Array by length of an array.
        ArrayList<String> arrS = new ArrayList<>();
        arrS.add("ABC");
        arrS.add("ABCDE");
        arrS.add("A");
        arrS.add("XYZABCDEF");
        arrS.add("AS");

        Comparator<String> comS = new Comparator<String>() {
            public int compare(String i, String j){
                            if((i.length())>(j.length()))
                            return 1;
                            else
                            return -1;

            }
        };
        Collections.sort(arrS,comS);
        System.out.println(arrS);

    }
}

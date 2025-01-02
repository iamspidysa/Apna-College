package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//ArrayList and LinkedList both done here.
public class ArrayListAnuj {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        List<Integer> list2 = list;
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(8);
        System.out.println(list);
        list2.add(10);
        list.addAll(list2);
        list.remove(4);
        list.remove(Integer.valueOf(1));
        System.out.print(list);
        System.out.print(list.get(4));

        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        list.clear();
        System.out.println(list);

        //Inserting Primitive array into ArrayList.
        int[] arr = { 1, 534, 6734, 345, 23477, 47, 47, 322, 42, 2 };
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i : arr) {
            arr2.add(i);
        }
        System.out.print("ArrayList: "+arr2);
    }
}

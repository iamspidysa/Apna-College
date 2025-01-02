import java.util.ArrayList;

public class Genericss {

    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        // list.add(1);
        // list.add("Saurabh");
        // list.add(12.21);
        // list.add(true);
        // System.out.println(list.get(2));
        // System.out.println(list.size());

        // Data in Array list is not common.
        //SO we need Generics to make arrayList if single data type.

        // ArrayList<Integer> list2 = new ArrayList<Integer>();
        // list2.add(1);
        // list2.add(12);
        // list2.add(32);
        // list2.add(43);
        // list2.get(2);

        // System.out.println();

        //Generics Use or syntax
        GenericsCheck<Integer> gen = new GenericsCheck<>(22);
        System.out.println(gen.getValue());

        //Method Generics and Constructor
        GenericsTest<Integer> iObj = new GenericsTest<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        GenericsTest<String> sObj = new GenericsTest<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());

        GenericsTest<Integer> iObj2 = new GenericsTest<Integer>(1);
        iObj2.setObject(22);
        System.out.println(iObj2.getObject2());
    }
}


class GenericsCheck<T>{
    private T value;

    public T getValue() {
        return value;
    }

    GenericsCheck(T value){
        this.value=value;
    }

}

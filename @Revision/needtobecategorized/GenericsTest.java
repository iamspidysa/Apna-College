public class GenericsTest<T> {
    private T obj;
    private T obj2;

    GenericsTest(T obj) {
        this.obj = obj;
    } // constructor

    public T getObject() {
        return this.obj;
    }
    public T getObject2() {
        return this.obj2;
    }


    public T setObject(T obj2) {
        return this.obj2 = obj2;
    }

    public static void main(String[] args) {
        // Test<Integer> iObj = new Test<Integer>(15);
        // System.out.println(iObj.getObject());

        // // instance of String type
        // Test<String> sObj = new Test<String>("GeeksForGeeks");
        // System.out.println(sObj.getObject());

        // Test<Integer> iObj2 = new Test<Integer>(1);
        // iObj2.setObject(22);
        // System.out.println(iObj2.obj2);
    }
}

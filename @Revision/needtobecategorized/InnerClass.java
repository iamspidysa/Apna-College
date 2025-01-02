abstract class A {
    abstract class B {
        void display();
    }
}

public class InnerClass {
    public static void main(String[] args) {
        // A obj1 = new A(); //Create Object of Top-most class.
        // A.B obj2 = obj1.new B(); //Add reference of 1st class to inner class.
        // obj2.display(); // to access the inner class method/variables.

        // If the inner class is static then,
        // A.B obj2 = new A.B();
        // obj2.display();
        // }
        a obj1 = new a() {
                public void display(){
                    System.out.println("I am not instance of A");
                }
        };
    }
}
//Learn this some other day using telusko #64 Video
@FunctionalInterface
interface func {
    void display();
    // void dis2(); // Can't declare because of annotation
}
// One way of doing 
class funcExtend implements func{
    public void display(){
        System.out.println("I am Functional Interface");
    }
}
//Second way do not implement the above class.
public class FunctionalIterface {
    public static void main(String[] args) {
        //One way
        func obj2 = new funcExtend();
        obj2.display();;
        //second way
        func obj1 = new func() {
            public void display(){
                System.out.println("I am Functional Interface Main");
            }
        };
        obj1.display();
    }
}

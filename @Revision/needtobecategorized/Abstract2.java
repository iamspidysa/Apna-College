 class Abstract2 extends Child{
    
}
abstract class Parent {
    abstract void run();
}

class Child extends Parent{
    void run(){
        System.out.println("Children is running");
    }
}
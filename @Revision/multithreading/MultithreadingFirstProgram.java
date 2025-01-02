//package multithreading;

// run is a method of Thread Class and must extend "Thread" to achieve multithreading.
class A extends Thread {
    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("HI");
        }
    }

}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("HELLO");
        }
    }

}

public class MultithreadingFirstProgram {
    public static void main(String[] args) {
        // 1st Program to achieve multithreading.
        A obj1 = new A();
        B obj2 = new B();
        // If we have to achieve multithreading we cannot name methods anything
        // We have to name it as "run()"
        // And if we have to call the method, we should do it with "start()" -- NOT BY
        // METHOD NAME
        obj1.start();
        obj2.start();
    }
}

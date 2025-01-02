package multithreading;

class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("HI");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("HELLO");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class ThreadPriority {
    public static void main(String[] args) throws InterruptedException {
        A obj1 = new A();
        B obj2 = new B();
        obj2.setPriority(Thread.MAX_PRIORITY-2);
        obj1.start();
        Thread.sleep(2);
        obj2.start();
        //To get obj1 or We can call it as Thread - Priority.
        System.out.println("Thread 1 Priority "+obj1.getPriority());

        System.out.println("Thread 2 Priority "+obj2.getPriority());

        //Thread Max and Min Priority Constants.
        System.out.println("Thread 2 Priority "+obj2.getPriority());
        

    }
}

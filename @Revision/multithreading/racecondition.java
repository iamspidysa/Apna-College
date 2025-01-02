package multithreading;

// synchronized and join() Learned
// join method helped two different thread to add a count variable.
// synchronized helped helped to achived the optimal result of both thread by running thread one by one.
class  Count_for_racecondition{
    int count;
    public synchronized void countMethod(){
        count++;
    }
}
public class racecondition {
    public static void main(String[] args) throws InterruptedException {
       Count_for_racecondition itirate = new Count_for_racecondition(); 
        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                itirate.countMethod();
            }
        }; 
    Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                itirate.countMethod();
            }
        };
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(itirate.count);
    }

}

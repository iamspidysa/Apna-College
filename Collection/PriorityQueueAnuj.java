package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueAnuj {
    public static void main(String[] args) {
        Queue<Integer> que = new PriorityQueue<>();
        // Passing Comparator.reverseOrder() gives Largest element in the Queue, else
        // normally it gives smallest.
        que.offer(34);
        que.offer(56);
        que.offer(01);
        que.offer(100);
        que.offer(50);
        System.out.println(que);
        System.out.println(que.poll());
        System.out.println(que);

        Queue<String> que2 = new PriorityQueue<>();
        que2.offer("Saurabh");
        que2.offer("Kumar");
        que2.offer("Anand");
        que2.offer("Imspidys");
        que2.offer("Cmspidys");
        que2.offer("SAURABH");
        que2.offer("saurabh");
        //String are arranged in lexicographically
        System.out.println(que2);


    }
}

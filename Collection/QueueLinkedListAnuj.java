package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListAnuj {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        // que.offer(12);
        // que.offer(14);
        que.offer(13);
        que.offer(32);
        try {
            que.remove();
            que.remove();
            que.remove();
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e);
        }

        // System.out.println(que.offer(123)); // returns true/false when insertion is
        // success or failed. Without
        // // intrupting the normal flow to code.
        System.out.println(que);
        // que.poll();
        // System.out.println(que);
        // System.out.println(que.peek());

        // System.out.println(que);

    }
}

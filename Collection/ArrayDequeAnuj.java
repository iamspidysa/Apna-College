package Collection;

import java.util.ArrayDeque;

public class ArrayDequeAnuj {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        // ArrayDeque is double-ended queue (deque) that allows fast insertion and
        // removal of elements from both ends (head and tail).
        // offer , poll , peak works same.
        // Extra Methods are offerFirst() , offerLast() and same for poll and peak.
        adq.offer(12);
        adq.offerFirst(24);
        adq.offerLast(2);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        adq.poll();
        System.out.println(adq);

        adq.pollFirst();
        System.out.println(adq);

        adq.pollLast();
        System.out.println(adq);
    }
}

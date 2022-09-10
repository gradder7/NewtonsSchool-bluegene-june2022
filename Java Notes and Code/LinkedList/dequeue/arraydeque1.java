package LinkedList.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class arraydeque1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> qu = new ArrayDeque<>();
        Deque<Integer> qu1 = new ArrayDeque<>();
        qu.addFirst(1);
        qu.addFirst(2);
        qu.addLast(4);
        qu1.addFirst(3);
         
        System.out.println(qu.getLast());
        System.out.println(qu1.peekLast());
    }
}

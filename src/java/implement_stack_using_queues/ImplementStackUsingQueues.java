package src.java.implement_stack_using_queues;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

    public Queue<Integer> queue;

    public ImplementStackUsingQueues() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        Queue<Integer> temp = new LinkedList<>();
        temp.add(x);
        for (Integer integer : queue) {
            temp.add(integer);
        }

        queue.clear();
        for (Integer integer : temp) {
            queue.add(integer);
        }
    }

    public int pop() {
        Integer peeked = queue.peek();
        queue.remove();
        return peeked;
    }

    public int top() {
        System.out.println(queue);
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

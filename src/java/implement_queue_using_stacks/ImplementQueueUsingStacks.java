package src.java.implement_queue_using_stacks;

import java.util.Queue;
import java.util.Stack;

public class ImplementQueueUsingStacks {

    public Stack<Integer> stack;

    public ImplementQueueUsingStacks() {
        stack = new Stack<>();
    }

    public void push(int x) {
        Stack<Integer> temp = new Stack<>();
        temp.push(x);
        for (Integer i : stack) {
            temp.push(i);
        }

        stack.clear();
        for (Integer i : temp) {
            stack.push(i);
        }
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }

}

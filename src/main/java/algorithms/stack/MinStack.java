package algorithms.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class MinStack {

    private final Deque<Integer> values = new ArrayDeque<>();
    private final Deque<Integer> mins = new ArrayDeque<>();

    public void push(int val) {
        values.push(val);
        if (mins.isEmpty()) {
            mins.push(val);
        } else {
            mins.push(Math.min(val, mins.peek()));
        }
    }

    public void pop() {
        if (values.isEmpty()) {
            throw new NoSuchElementException("MinStack is empty");
        }
        values.pop();
        mins.pop();
    }

    public int top() {
        if (values.isEmpty()) {
            throw new NoSuchElementException("MinStack is empty");
        }
        return values.peek();
    }

    public int getMin() {
        if (mins.isEmpty()) {
            throw new NoSuchElementException("MinStack is empty");
        }
        return mins.peek();
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }
}
import java.util.Stack;

public class MinStack_155 {
    /** initialize your data structure here. */
    long min;
    Stack<Long> stack;

    public MinStack_155() {
        stack = new Stack<>();

    }

    public void push(int x) {
        if (stack.empty()) {
            stack.push(0L);
            min = x;
        } else {
            stack.push(x-min);
            if (x < min) {
                min = x;
            }
        }
    }

    public void pop() {
        if (stack.empty()) {return;}
        long p = stack.pop();
        if (p < 0) {
            min = min - p;
        }

    }

    public int top() {
        if (stack.peek() < 0) {
            return (int)min;
        } else {
            return (int)(stack.peek() + min);
        }


    }

    public int getMin() {
        return (int)min;

    }

}

package code401Challenges.stacksandqueues;

import java.util.EmptyStackException;

public class PseudoQueue {

    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    public void enqueue(int value) {
        int item;
        if (stack1.isEmpty() && !stack2.isEmpty()) {
            while(!stack2.isEmpty()){
                item = stack2.pop();
                stack1.push(item);
            }
            stack1.push(value);
        } else {
            stack1.push(value);
        }
    }


    public int dequeue() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public int peek() throws EmptyStackException {
        if (stack1.top == null) {
            throw new EmptyStackException();
        } else {
            return stack1.top.data;
        }
    }
}

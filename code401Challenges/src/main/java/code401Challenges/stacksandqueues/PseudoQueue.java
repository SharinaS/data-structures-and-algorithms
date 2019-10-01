package code401Challenges.stacksandqueues;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/* To enqueue, we make sure there's stuff in the enqueue stack, or the first stack. To Dequeue, we flip the stuff into the
* dequeue stack, or stack 2*/

public class PseudoQueue {

    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    // =========== less optimal way to do code challenge - the following has either full or empty stacks.

//    public void enqueue(int value) {
//        while(!stack2.isEmpty()){
//            stack1.push(stack2.pop());
//        }
//        stack1.push(value);
//    }


//    public int dequeue() {
//        while (!stack1.isEmpty()) {
//            stack2.push(stack1.pop());
//        }
//        return stack2.pop();
//    }

    // ========== more optimized way of doing this code challenge -
    // both stacks are working; they don't have to be all empty or all full.

    public void enqueue(int value){
        stack1.push(value);
    }

    public int dequeue() {
        if(!stack2.isEmpty()) {
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            // if still nothing on the deq stack, there's an error
            if(stack2.isEmpty()){
                throw new NoSuchElementException();
            }
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

package QueueWithTwoStacks;

import java.util.Deque;
import java.util.LinkedList;
import org.junit.Test;

/**
 * QueueWithTwoStacks
 *
 * @author spy@pku.edu.cn
 */


public class CQueue {

    public CQueue() {
        this.firstStack = new LinkedList<>();
        this.reversedStack = new LinkedList<>();
    }

    private Deque<Integer> firstStack;
    private Deque<Integer> reversedStack;

    /**
     * Time Complexity: O(1) Space Complexity: O(1)
     */
    public void appendTail(int value) {
        firstStack.addFirst(value);
    }

    /**
     * Time Complexity: O(n) Space Complexity: O(1)
     */
    public int deleteHead() {
        if (reversedStack.isEmpty()) {
            while (firstStack.peekFirst() != null) {
                reversedStack.addFirst(firstStack.removeFirst());
            }
        }
        if (reversedStack.isEmpty()) {
            return -1;
        }
        return reversedStack.removeFirst();
    }


}

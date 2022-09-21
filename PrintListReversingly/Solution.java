package PrintListReversingly;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;

public class Solution {

    public int[] reversePrint(ListNode head) {
        Deque<Integer> stack = new LinkedList<>();
        Queue<Integer> reveresList = new LinkedList<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        while (stack.peekFirst() != null) {
            reveresList.add(stack.removeFirst());
        }
        return reveresList.stream().mapToInt(Integer::valueOf).toArray();

    }




}
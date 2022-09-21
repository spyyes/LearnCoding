package PrintListReversingly;

import java.util.Arrays;
import org.junit.Test;

/**
 * a brief introduction
 *
 * @author spy@pku.edu.cn
 */
public class SolutionTest {

    @Test
    public void testReplaceString() {

        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        int[] result = solution.reversePrint(head);
        System.out.println(Arrays.toString(result));
    }
}
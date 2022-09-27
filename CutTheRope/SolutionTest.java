package CutTheRope;

import org.junit.Test;

/**
 * a brief introduction
 *
 * @author spy@pku.edu.cn
 */
public class SolutionTest {

    @Test
    public void testCase(){
        Solution solution = new Solution();
        int result = solution.cuttingRope(2);
        System.out.println(result);
        result = solution.cuttingRope(10);
        System.out.println(result);
    }
}

package RoadInMatrix;

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
        char board[][]  = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(solution.exist(board,word));
    }

    @Test
    public void testCase2(){
        Solution solution = new Solution();
        char board[][]  = {{'a','b'},{'c', 'd'}};
        String word = "abcd";
        System.out.println(solution.exist(board,word));
    }
}

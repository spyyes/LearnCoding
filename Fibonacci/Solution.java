package Fibonacci;

/**
 * a brief introduction
 *
 * @author spy@pku.edu.cn
 */
public class Solution {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param n
     * @return
     */
    public int fib(int n) {
        int[] result = new int[101];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = (result[i - 1] + result[i - 2]) % 1000000007;
        }
        return result[n];
    }
}
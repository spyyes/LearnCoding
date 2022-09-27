package CutTheRope;

import static java.lang.Math.max;

/**
 * a brief introduction
 *
 * @author spy@pku.edu.cn
 */
class Solution {

    /**
     * Time Complexity: O(nlogn)
     * Space Complexity: O(n)
     * @param n
     * @return
     */
    public int cuttingRope(int n) {
        if (n == 0) {
            return 0;
        }
        int[] best = new int[n + 1];
        best[0] = 0;
        best[1] = 1;
        for (int i = 2; i <= n; i++) {
            int maxI = 0;
            for (int j = 1; j <= i/2 + 1; j++) {
                maxI = max(maxI, j * best[i - j]);
                maxI = max(maxI, j * (i-j));
            }
            best[i] = maxI;
        }
        return best[n];

    }
}
package FindInPartlySortedMatrix;

/**
 * a brief introduction
 *
 * @author spy@pku.edu.cn
 */
class Solution {

    private void test() {
        int[][] matrix = {{1,2}, {}};
    }

    /**
     * Time Complexity: O(n+m) Space Complexity: O(1)
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //matrix 边界条件检查
        if (matrix == null) {
            return false;
        }
        int n = matrix.length;
        if (n == 0) {
            return false;
        }
        int m = matrix[0].length;
        if (m == 0) {
            return false;
        }

        int x = 0, y = m - 1;
        while (x < n && y >= 0) {
            if (matrix[x][y] == target) {
                return true;
            }
            if (matrix[x][y] > target) {
                y -= 1;
                continue;
            }
            if (matrix[x][y] < target) {
                x += 1;
                continue;
            }
        }
        return false;

    }
}
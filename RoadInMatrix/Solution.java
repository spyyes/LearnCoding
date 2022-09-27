package RoadInMatrix;

/**
 * a brief introduction
 *
 * @author spy@pku.edu.cn
 */
class Solution {

    private int m, n, k;
    char[][] board;
    char[] chars;

    /**
     * Time Complexity: O(m*n*3^K)
     * Space Complexity: O(m*n)
     * @param board
     * @param word
     * @return
     */
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.chars = word.toCharArray();
        if (word.length() == 0) {
            return true;//返回约定值
        }
        if (board.length == 0) {
            return false;//返回约定值
        }
        if (board[0].length == 0) {
            return false;//返回约定值
        }
        m = board.length;
        n = board[0].length;
        k = word.length();

        boolean[][] visited = new boolean[m][n];
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                int z = 0;
                boolean ret = search(visited, x, y, z);
                if (ret) {
                    return true;
                }
            }
        }
        return false;

    }

    public boolean search(boolean[][] visited, int x, int y, int z) {
        if (z == k) {
            return true;
        }
        if (x >= m || x < 0 || y >= n || y < 0) {
            return false;
        }
        if (visited[x][y] == true) {
            return false;
        }
        if (chars[z] != board[x][y]) {
            return false;
        }
        //chars[z] == board[x][y]
        visited[x][y] = true;
        boolean ret = search(visited, x, y + 1, z + 1) || search(visited, x, y - 1, z + 1)
            || search(visited, x + 1, y, z + 1) || search(visited, x - 1, y, z + 1);
        if (ret) {
            return true;
        }
        visited[x][y] = false;
        return false;
    }
}
package algorithms._0064_minimum_path_sum;

/**
 * ** Created by peter.guan on 2021/07/20.
 *
 * @author peter.guan
 */
public class MinimumPathSum {

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] path = new int[m][n];
        path[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            path[i][0] = path[i - 1][0] + grid[i][0];
        }

        for (int j = 1; j < n; j++) {
            path[0][j] = path[0][j - 1] + grid[0][j];
        }

        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col++) {
                path[row][col] = Math.min(path[row - 1][col], path[row][col - 1]) + grid[row][col];
            }
        }
        return path[m - 1][n - 1];
    }


    public static void main(String[] args) {
        MinimumPathSum sum = new MinimumPathSum();
        int[][] grid = new int[][]{{1, 2, 3}, {4, 5, 6}};
        sum.minPathSum(grid);
    }
}

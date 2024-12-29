package classic_interview_6._0108;

import java.util.HashSet;
import java.util.Set;

/**
 * ** Created by Peter on 2023年04月23日, 0023.
 *
 * @author Peter
 */
public class ZeroSquare {

  public void setZeroes(int[][] matrix) {
    int n = matrix.length;
    int m = matrix[0].length;
    boolean[] rows = new boolean[n];
    boolean[] cols = new boolean[m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matrix[i][j] == 0) {
          rows[i] = cols[j] = true;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (rows[i] || cols[j]) {
          matrix[i][j] = 0;
        }
      }
    }
  }

}

package classic_interview_6._0107;

import com.sun.org.apache.xalan.internal.xsltc.trax.SmartTransformerFactoryImpl;

/**
 * ** Created by Peter on 2022年09月16日, 0016.
 *
 * @author Peter
 */
public class RotateSquare {

  public void rotate(int[][] matrix) {
    int n = matrix.length;
    int temp;
    for (int i = 0; i < n / 2; i++) {
      for (int j = 0; j < n; j++) {
        temp = matrix[i][j];
        matrix[i][j] = matrix[n - i - 1][j];
        matrix[n - i - 1][j] = temp;
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
  }


}

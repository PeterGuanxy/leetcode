package algorithms._0036_valid_sudoku;

/**
 * ** Created by peter.guan on 2021/06/29.
 *
 * @author peter.guan
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        int[] row = new int[10];
        int[] column = new int[10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    row[board[i][j] - 48]++;
                    if (row[board[i][j] - 48] > 1) {
                        return false;
                    }
                }
                if (board[j][i] != '.') {
                    column[board[j][i] - 48]++;
                    if (column[board[j][i] - 48] > 1) {
                        return false;
                    }
                }
            }
            row = new int[10];
            column = new int[10];
        }

        return checkBox(0, 0, board);
    }

    public boolean checkBox(int row, int column, char[][] board) {
        int[] temp = new int[10];
        for (int i = row; i < row + 3; i++) {
            for (int j = column; j < column + 3; j++) {
                if (board[i][j] != '.') {
                    temp[board[i][j] - 48]++;
                    if (temp[board[i][j] - 48] > 1) {
                        return false;
                    }
                }
            }
        }
        column += 3;
        if (column > 6) {
            column = 0;
            row += 3;
            if (row > 6) {
                return true;
            }
        }
        return checkBox(row, column, board);
    }

    public static void main(String[] args) {
        char a = '0';
        int b = a - 48;
        System.out.println(b);
    }
}

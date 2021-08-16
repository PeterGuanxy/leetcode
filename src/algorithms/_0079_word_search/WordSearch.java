package algorithms._0079_word_search;

/**
 * ** Created by peter.guan on 2021/08/16.
 *
 * @author peter.guan
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (search(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean search(char[][] board, String word, int i, int j, int count) {
        if (word.length() == count) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(count)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';

        boolean check = search(board, word, i + 1, j, count + 1) || search(board, word, i - 1, j, count + 1)
                || search(board, word, i, j + 1, count + 1) || search(board, word, i, j - 1, count + 1);

        board[i][j] = temp;
        return check;

    }

}
